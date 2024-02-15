import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.ArrayDeque;
import java.util.Deque;


public class Main 
{
    public static void main(String[] args)  throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        Deque<Integer> deque = new ArrayDeque<>();
        
        int n = Integer.parseInt(br.readLine());
        
        int A[] = new int[n]; //0 1 1 0
        int B[] = new int[n]; //1 2 3 4
        
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++)
        {
            A[i] = Integer.parseInt(st1.nextToken());
        }
        
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++)
        {
            B[i] = Integer.parseInt(st2.nextToken());
        }
        
        
        int m = Integer.parseInt(br.readLine());
        
        int C[] = new int[m]; //2 4 7
        StringTokenizer st3 = new StringTokenizer(br.readLine());
        for(int i=0; i<m; i++)
        {
            C[i] = Integer.parseInt(st3.nextToken());
        }
        
        for(int i=0; i<n; i++)
        {
        	if(A[i]==0)
        	{
        		deque.addFirst(B[i]);
        	}
        }
        
        for(int i=0; i<m; i++)
        {
        	deque.add(C[i]);
        	bw.write(deque.pollFirst()+" ");
        }
       
        bw.flush();
        bw.close();

    }
}
