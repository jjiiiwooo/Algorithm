import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main 
{
    static int max;
    static int memo[] = new int[100000];
    
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        int input[] = new int[n];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<input.length; i++)
        {
            
            input[i] = Integer.parseInt(st.nextToken());
        }
        
        max = input[0];
        memo[0] = input[0];
        
        for(int i=1; i<n;++i)
        {
            memo[i] = Math.max(memo[i-1]+input[i], input[i]);
            max = Math.max(memo[i],max);
        }
        
        bw.write(max+"");
        
        bw.flush();
        bw.close();
    }
    
    
}