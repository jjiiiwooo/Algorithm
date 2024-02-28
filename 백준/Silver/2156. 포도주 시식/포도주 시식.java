import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main 
{
    static int podoju[];
    static int memo[];
    
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        podoju = new int[n+1];
        memo = new int[n+1];
        
        
        for(int i=1; i<=n; i++)
        {
        	StringTokenizer st = new StringTokenizer(br.readLine());
            podoju[i] = Integer.parseInt(st.nextToken());
        }
        
        memo[1] = podoju[1];
        
        if(n>1)
        {
            memo[2] = podoju[1] + podoju[2];
        }
        
        for(int i=3; i<=n; i++)
        {
            memo[i] = Math.max(memo[i-1], Math.max(memo[i-2]+podoju[i], memo[i-3]+podoju[i-1]+podoju[i]));
        }
        
        bw.write(memo[n]+"");
        
        bw.flush();
        bw.close();
    }
}