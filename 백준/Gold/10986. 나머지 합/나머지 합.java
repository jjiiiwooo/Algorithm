import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st ;
        st= new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        long result = 0;
        long remainder[] = new long[n+1];
        long cnt[] = new long[m];
        
        
        
        st = new StringTokenizer(br.readLine());
        
        //누적합을 m으로 나눈 나머지를 배열 S에 저장 
        for(int i=1; i<n+1; i++)
        {
        	remainder[i] = (remainder[i-1] +Integer.parseInt(st.nextToken()))%m;
        	
        	if(remainder[i] ==0)
        	{
        		result++;
        	}
        	
        	//나머지가 같은 인덱스의 수 카운팅
        	cnt[(int)remainder[i]]++;
        }
        
        for(int i=0; i<m; i++)
        {
        	if(cnt[i]>1)
        	{
        		result += (cnt[i]*(cnt[i]-1)/2);
        	}
        }
        
        bw.write(result+"");
        
        bw.flush();
        bw.close();
    }
}