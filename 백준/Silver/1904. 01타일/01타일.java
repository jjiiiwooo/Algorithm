import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
        int n = Integer.parseInt(br.readLine());
        int memo[] = new int[n+1];
        
        
        memo[1] =1;
        
        if(n>1)
        {
        	memo[2]=2;
        }
        
        for(int i=3; i<=n; i++)
        {
        	memo[i] = memo[i-1]+memo[i-2];
        	memo[i]%=15746;
        }
        
        bw.write(memo[n]+"");
        
        bw.flush();
        bw.close();
   
    }
}