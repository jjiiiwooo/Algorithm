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
     
    	int max = 1000000;
    	//false이면 소수 
        boolean prime[] = new boolean[max+1];
        
        prime[0] = true;
        prime[1] = true;
        
        for(int i=2; i<= Math.sqrt(max); i++)
        {
        	if(prime[i]) continue;
        	for(int j=i*i; j<=max; j+=i)
        	{
        		prime[j]=true;
        	}
        }
        
        int num = Integer.parseInt(br.readLine());
        
        for(int i=0; i<num; i++)
        {
        	int count = 0;
        	int n = Integer.parseInt(br.readLine());
        	for(int j=2; j<=n/2; j++)
        	{
        		if(!prime[j] && !prime[n-j])
        			count++;
        	}
        	bw.write(count+"");
        	bw.newLine();
        }

        
        bw.flush();
        bw.close();
        
    }
}