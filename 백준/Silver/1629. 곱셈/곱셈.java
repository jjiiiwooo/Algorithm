import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static long C;
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        C = Long.parseLong(st.nextToken());
        
        bw.write(pow(A,B)%C+"");
        bw.flush();
        bw.close();
        
    }
    
    static long pow(long A, long n)
    {
        if(n==1)
        {
        	return A%C;
        }
        
        long temp = pow(A,n/2);
        
        if(n%2 == 1)
        {
        	return (temp*temp%C)*A%C;
        }
        else
        {
        	return temp*temp%C;
        }
    }
}