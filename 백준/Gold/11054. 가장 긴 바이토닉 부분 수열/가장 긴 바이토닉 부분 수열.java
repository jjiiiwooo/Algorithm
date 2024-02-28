import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    static int num[];
    static int R_memo[];
    static int L_memo[];
    
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        num = new int[n];
        R_memo = new int[n];
        L_memo = new int[n];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++)
        {
            num[i] = Integer.parseInt(st.nextToken());
        }
        
        //오름차순
        for(int i=0; i<n; i++)
        {
            R_memo[i] = 1; //1로 초기화 
            
            for(int j=0; j<i; j++)
            {
                if(num[j]<num[i] &&R_memo[i]<R_memo[j]+1)
                {
                    R_memo[i] = R_memo[j] +1;
                }
            }
        }
        
        //내림차순
        for(int i=n-1; i>=0; i--)
        {
            L_memo[i]=1;
            
            for(int j=n-1; j>=i; j--)
            {
                if(num[j]<num[i] && L_memo[i]<L_memo[j]+1)
                {
                    L_memo[i] = L_memo[j]+1;
                }
            }
        }
        
        int max = 0;
        for(int i=0; i<n; i++)
        {
            if(max<R_memo[i]+L_memo[i])
            {
                max = R_memo[i] + L_memo[i];
            }
        }
        
        bw.write(String.valueOf(max-1));
        
        bw.flush();
        bw.close();
        
    }
}