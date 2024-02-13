import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	//Lower Bound = 일치하는 숫자가 처음 나타나는 지점
	public static int Lower_bound(int target[] , int key)
	{
		int start = 0;
		int end = target.length;
		
		while(start<end)
		{
			int mid = (start+end)/2;
			
			if(key<=target[mid])
			{
				end = mid;
			}
			else
			{
				start = mid+1;
			}
		}
		return start;
	}
	
	//Upper Bound = 일치하는 숫자 다음 수가 나타나는 지점
	public static int Upper_bound(int target[], int key)
	{
		int start = 0;
		int end = target.length;
		
		while(start<end)
		{
			int mid = (start+end)/2;
			
			if(key<target[mid])
			{
				end = mid;
			}
			else
			{
				start = mid+1;
			}
		}
		
		return start;
		
	}
	

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        int card[] = new int[n];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++)
        {
        	card[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(card);
        
        int m = Integer.parseInt(br.readLine());
        
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<m; i++)
        {
        	int key = Integer.parseInt(st.nextToken());
        	
        	bw.write(Upper_bound(card,key)- Lower_bound(card,key)+" ");
        }
        
        bw.flush();
        bw.close();
    }
}