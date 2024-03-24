import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main 
{
    
    
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        int data[] = new int[N+1];
        
        for(int i=0; i<N; i++)
        {
           StringTokenizer st = new StringTokenizer(br.readLine());
           for(int j=0; j<2; j++)
           {
               data[i+j] = Integer.parseInt(st.nextToken());
           }
        }
        
        int memo[][] = new int[N+1][N+1];
        for(int L=0; L<N; L++)
        {
            for(int i=1; i<N-L; i++)
            {
                int j= i+L+1;
                memo[i][j] = Integer.MAX_VALUE;
                for(int k=i; k<j; k++)
                {
                   memo[i][j] = Math.min(memo[i][j],memo[i][k]+memo[k+1][j]+(data[i-1]*data[k]*data[j]));
                    
                }
            }
        }
        
        bw.write(String.valueOf(memo[1][N]));
        
        bw.flush();
        bw.close();
        
        
    }
}