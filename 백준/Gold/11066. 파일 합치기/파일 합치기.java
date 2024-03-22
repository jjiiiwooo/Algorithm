import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main
{

    static int arr[];
    static int memo[][];
    static int sum[]; //i부터 j까지의 파일을 더한 총합
    
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        
        while(T-->0)
        {
        	int K = Integer.parseInt(br.readLine());
        	
        	arr = new int[K+1];
        	memo = new int[K+1][K+1];
        	sum = new int[K+1];
        	
        	st = new StringTokenizer(br.readLine());
        	for(int i=1; i<=K; i++)
        	{
        		arr[i] = Integer.parseInt(st.nextToken());
        		sum[i] = sum[i-1] + arr[i];
        	}
        	
        	//n: 구해야 하는 범위의 크기 
        	for(int n=1; n<=K; n++)
        	{
        		//from : 합치는 범위의 시작부분
        		for(int from=1;from+n<=K; from++)
        		{
        			int to = from+n;
        			memo[from][to] = Integer.MAX_VALUE;
        			
        			//divide : 구해야 하는 범위를 두 부분으로 나누는 기준점
        			for(int divide = from; divide<to; divide++)
        			{
        				memo[from][to] = Math.min(memo[from][to], memo[from][divide]+memo[divide+1][to] + sum[to] - sum[from-1]);
        			}
        		  
        		}
        	}
        	
        	bw.write(String.valueOf(memo[1][K]));
        	bw.newLine();
        }
        bw.flush();
        bw.close();
        
    }
}