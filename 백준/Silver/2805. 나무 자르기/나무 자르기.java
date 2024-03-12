import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    static int N,M;
    static int Tree[];
    static long max,min,mid;
    
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st;
        st= new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); //나무의 수 
        M = Integer.parseInt(st.nextToken()); //나무의 길이 
        
        Tree = new int[N];
        
        max = Long.MIN_VALUE;
        min =0;
        
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++)
        {
            Tree[i] = Integer.parseInt(st.nextToken());
            max = Math.max(Tree[i],max);
        }
        max++;
        
        while(min<max)
        {
            mid = (min+max)/2;
            
            long sum = 0;
            
            for(int i=0; i<N; i++)
            {
                if(Tree[i]-mid>0)
                {
                    sum+=(Tree[i]-mid);
                }
            }
            
            if(sum<M)
            {
                max=mid;
            }
            else
            {
                min=mid+1;
            }
        }
        
        bw.write(String.valueOf(min-1));
        
        bw.flush();
        bw.close();
        br.close();
        
    }
    
}