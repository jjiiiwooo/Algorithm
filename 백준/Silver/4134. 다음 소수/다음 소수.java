import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    //a 이상의 소수 중 최솟값 구하기 
    public static boolean isPrime(long n)
    {
    	//소수 판별시 루트 n까지 나누어 진행 
    	if(n<2)
    	{
    		return false;
    	}
    	
    	for(int i=2; i<=Math.sqrt(n); i++)
    	{
    		if(n%i==0) return false; //나누어지면 소수가 아님
    	}
    	return true;
    	
    }
    
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int num = Integer.parseInt(br.readLine());
        
        for(int i=0; i<num; i++)
        {
            long n = Long.parseLong(br.readLine());
            
            if(n<=2) 
            {
            	bw.write(2+"");
            }
            else
            {
            	while(!isPrime(n))
            	{
            		n++;
            	}
            	bw.write(n+"");
            }
            bw.newLine();
          
        }
   
        bw.flush();
        bw.close();
        
    }
}