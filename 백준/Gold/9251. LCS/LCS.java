import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    static int memo[][] = new int [1001][1001];
    
    public static void main(String[] args)throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        
        char[] s1 = br.readLine().toCharArray();
        char[] s2 = br.readLine().toCharArray();
        
        int len1 = s1.length;
        int len2 = s2.length;
        
        int memo[][] = new int[len1+1][len2+1];
        
        for(int i=1; i<=len1;i++)
        {
        	for(int j=1; j<=len2; j++)
        	{
        		//(i-1)과 (j-1)번쨰 문자가 서로 같다면
        		if(s1[i-1]==s2[j-1])
        		{
        			memo[i][j] = memo[i-1][j-1]+1;
        		}
        		else
        		{
        			//같지 않다면 이전 열(i-1)과 이전 행(j-1)의 값 중 큰 것으로 갱신
        			memo[i][j] = Math.max(memo[i-1][j],memo[i][j-1]);
        		}
        	}
        }
        
        bw.write(memo[len1][len2]+"");
       
        bw.flush();
        bw.close();
        
    }
}

