import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main
{
	static int gcd(int a, int b)
	{
		if(b==0) return a;
		return gcd(b,a%b);
	}
    
    public static void main(String[] args)throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        int A[] = new int[N];
        int B[] = new int[N];
        
        int sum_A=0;
        int sum_B=0;
        
        StringTokenizer st; 
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++)
        {
            A[i] = Integer.parseInt(st.nextToken());

        }
        
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++)
        {
            B[i] = Integer.parseInt(st.nextToken());
        }
        
        for(int i=0; i<N; i++)
        {
        	sum_A += A[i];
        	sum_B += B[i];
        }

        int k = gcd(sum_A,sum_B);
        
        int a = sum_B/k;
        int b = sum_A/k;
        System.out.println(a+" "+b);
    }
}