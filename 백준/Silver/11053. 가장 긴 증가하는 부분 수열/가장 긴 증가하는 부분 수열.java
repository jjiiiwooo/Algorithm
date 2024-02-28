import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    static int num[];
    static int memo[];
    
       
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        num = new int[n];
        memo = new int[n];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++)
        {
            
            num[i] = Integer.parseInt(st.nextToken());
        }
        
        
        for(int i=0; i<n; i++)
        {
        	memo[i] =1; //1로 초기화 
        	
        	//0~i이전 원소들 탐색
        	for(int j=0; j<i; j++)
        	{
        		//j번째 원소가 i번째 원소보다 작으면서 i번째 memo가 j번째 memo+1 값보다 작은 경우 
        		if(num[j]<num[i] && memo[i]<memo[j]+1)
        		{
        			memo[i] = memo[j]+1; //j번째 원소의 +1 값이 i번째 memo가 된다. 
        		}
        	}
        	
        }
        
        //최댓값(최대 길이) 탐색
        int max = -1;
        for(int i=0; i<n; i++)
        {
        	max = memo[i]>max ? memo[i]:max;
        }
        
        bw.write(max+"");        
        bw.flush();
        bw.close();
        
    }
}