import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        boolean isPrime[] = new boolean[N+1];
        ArrayList<Integer>Primes = new ArrayList<>();
        
        //에라토스테네스의 체 
        isPrime[0]= isPrime[1] = true;
        for(int i=2; i*i<=N; i++)
        {
        	if(!isPrime[i])
        	{
        		for(int j=i*i; j<=N; j+=i)
        		{
        			isPrime[j] = true;
        		}
        	}
        }
        
        for(int i=1; i<=N; i++)
        {
        	if(!isPrime[i])
        	{
        		Primes.add(i);
        	}
        }
        
        int start = 0;
        int end = 0;
        int sum = 2;
        int count = 0;
        int size = Primes.size();
        
        while(start<size && end <size)
        {
        	if(sum==N)
        	{
        		count++;
        		sum -= Primes.get(start);
        		start++;
        	}
        	else if(sum >N)
        	{
        		sum-=Primes.get(start);
        		start++;
        	}
        	else
        	{
        		end++;
        		if(end>=size) break;
        		sum+=Primes.get(end);
        	}
        }
  
        bw.write(String.valueOf(count));
        
        bw.flush();
        bw.close();
        
    }
}