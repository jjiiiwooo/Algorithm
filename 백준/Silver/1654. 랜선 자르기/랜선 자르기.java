import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    static int lansun[];
    static long max, min, mid;
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int K = Integer.parseInt(st.nextToken()); //이미 가지고 있는 랜선의 개수
        int N = Integer.parseInt(st.nextToken()); //필요한 랜선의 개수 
        
        lansun = new int[K];
        
        max = Long.MIN_VALUE;
        min = 0;
        
        for(int i=0; i<K; i++)
        {
        	st = new StringTokenizer(br.readLine());
            lansun[i] = Integer.parseInt(st.nextToken());
            max = Math.max(lansun[i],max);
        }
        max++;
        
        while(min<max)
        {
            mid = (min+max)/2;
            
            long cnt = 0;
            
            for(int i=0; i<K; i++)
            {
                cnt +=lansun[i]/mid; //각 랜선마다 몇 칸씩 나오는지 
            }
            
            if(cnt<N)
            {
                max = mid;
            }
            else
            {
                min = mid+1;
            }
        }
        
        bw.write(String.valueOf(min-1));
        
        bw.flush();
        bw.close();
        br.close();
    }
}
