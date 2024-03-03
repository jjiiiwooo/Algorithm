import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    static int count=0;
    
    public static void main(String[] args)throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        int coin[] = new int[n];
        

        for(int i=0; i<n; i++)
        {
        	st= new StringTokenizer(br.readLine());
        	coin[i] = Integer.parseInt(st.nextToken());
        }
       
        for(int i=n-1; i>=0; i--)
        {
        	if(coin[i]<=k)
        	{
        		//현재 가치의 동전으로 구성할 수 있는 개수를 더해줌 
        		count+=(k/coin[i]);
        		k = k%coin[i];
        	}
        }
        
        bw.write(count+"");
        
        bw.flush();
        bw.close();
        
    }
}