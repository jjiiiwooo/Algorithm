import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    static int N,K;
    static long max,min,mid;
    static long count;
    
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        N = Integer.parseInt(br.readLine());
        K = Integer.parseInt(br.readLine());
        
        //x는 1< = x <= K의 범위를 가짐
        min = 1;
        max = K;
        
        while(min<max)
        {
            mid = (min+max)/2;
            count = 0;
            
            for(int i=1; i<=N; i++)
            {
                count += Math.min(mid/i,N);
                
            }
            
            //count가 많다는 것은 임의의 x(mid)보다 작은 수가 B[K]보다 많다는 뜻
            if(K<=count)
            {
                max = mid;
            }
            else
            {
                min = mid +1;
            }
        }

        bw.write(String.valueOf(min));
        
        bw.flush();
        bw.close();
        br.close();

    }
   
}
