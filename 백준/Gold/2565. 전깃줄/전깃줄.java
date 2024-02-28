import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Comparator;
import java.util.Arrays;


public class Main {
	static int A;
	static int B;
    static int memo[];
    static int arr[];
    
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine()); //전깃줄 개수
      
        int memo[] = new int[n];
        int input[][] = new int[n][2];
        
        
        for(int i=0; i<n;i++)
        {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	input[i][0] = Integer.parseInt(st.nextToken());
        	input[i][1] = Integer.parseInt(st.nextToken());
        }
        
        //A를 기준으로 정렬
        Arrays.sort(input, new Comparator<int[]>() {
        	@Override
        	public int compare(int[] o1, int[] o2) {
        		return o1[0] - o2[0];
        	}
        });
        
        for(int i=0; i<memo.length; i++)
        {
        	memo[i] = 1;
        	
        	//i번째 전봇대를 기준으로 이전의 전봇대들의 전선을 연결하기 위한 탐색
        	//i번째 전봇대에 연결된 B전봇대는 탐색할 j번째 전봇대에 연결된 B전봇대보다 값이 커야함
        	for(int j=0; j<i; j++)
        	{
        		if(input[i][1]>input[j][1])
        		{
        			memo[i] = Math.max(memo[i], memo[j]+1);
        		}
        	}
        }
        
        int max = 0;
        for(int i=0; i<n; i++)
        {
        	max = Math.max(max, memo[i]);
        }
       
       int result = n - max;
       bw.write(result+"");
       
       bw.flush();
       bw.close();
        
        
    }
}