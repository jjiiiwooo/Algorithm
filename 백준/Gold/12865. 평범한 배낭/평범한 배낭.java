import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    static int memo[][];
    static int W[];
    static int V[];
    
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); //물품의 수
        int k = Integer.parseInt(st.nextToken()); //무게
        
        V = new int[n+1]; //가치
        W = new int[n+1]; //무게
        
        memo = new int[n+1][k+1];
       
        
        for(int i=1; i<=n; i++)
        {
          st = new StringTokenizer(br.readLine());
          W[i] = Integer.parseInt(st.nextToken());
          V[i] = Integer.parseInt(st.nextToken());
        }
        
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=k; j++)
            {
                if(W[i]>j)
                {
                    memo[i][j] = memo[i-1][j];
                }
                else
                {
                    memo[i][j] = Math.max(memo[i-1][j], memo[i-1][j-W[i]]+V[i]);
                }
            }
        }
        bw.write(memo[n][k]+"");
        
        bw.flush();
        bw.close();
    }
}