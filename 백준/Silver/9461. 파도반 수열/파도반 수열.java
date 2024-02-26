import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static long memo[] = new long[101];
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        memo[0]=0L;
        memo[1]=1L;
        memo[2]=1L;
        memo[3]=1L;
        
        int T = Integer.parseInt(br.readLine());
        
        for(int i=0; i<T; i++)
        {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int n = Integer.parseInt(st.nextToken());
        	bw.write(df(n)+"");
        	bw.newLine();
        }
        
        bw.flush();
        bw.close();
    }
    
    public static long df(int n)
    {
    	if(memo[n]==0)
    	{
    		memo[n] = df(n-2) + df(n-3);
    	}
    	return memo[n];
    }
}