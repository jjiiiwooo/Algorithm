import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;



public class Main {
    
	static int dp[][] = new int[30][30];
	
    public static int combination(int n ,int r)
    {
    	//이미 계산된 값일 경우 
    	if(dp[n][r]>0)
    	{
    		return dp[n][r];
    	}
    	
        if(n==r||r==0)
        {
            return dp[n][r] = 1;
        }
        
        return dp[n][r]=combination(n-1,r-1)+combination(n-1,r);
    }
    public static void main(String[] args) throws IOException
    {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        for(int i=0; i<num; i++)
        {
        	StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            
            bw.write(combination(m,n)+"");
            bw.newLine();
        }
        
        bw.flush();
        bw.close();
        
        
    }
}