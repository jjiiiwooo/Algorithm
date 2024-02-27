import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    static int memo[] = new int[1000001];
    
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        for(int i=2; i<=n;i++)
        {
            memo[i] = memo[i-1]+1;
            
            if(i%2==0)
            {
                memo[i] = Math.min(memo[i], memo[i/2]+1);
            }
            
            if(i%3==0)
            {
                memo[i] = Math.min(memo[i], memo[i/3]+1);
            }
        }
        
        
        bw.write(memo[n]+"");
        bw.flush();
        bw.close();
        
        
        
    }
}