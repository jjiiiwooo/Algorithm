import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    static Integer triangle[][];
    static Integer memo[][];
    static int n;
    
    static int df(int depth, int idx)
    {
        //마지막 행일 경우 현재 위치의 memo값 반환
        if(depth==n-1) 
            return memo[depth][idx];
        
        //탐색하지 않았던 값일 경우 다음 행의 양쪽 값 비교 
        if(memo[depth][idx]==null)
        {
            memo[depth][idx] = Math.max(df(depth+1,idx), df(depth+1, idx+1)) + triangle[depth][idx];
        }
        return memo[depth][idx];
    }
    
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        n = Integer.parseInt(br.readLine());
        triangle = new Integer[n][n];
        memo = new Integer[n][n]; //범위가 0부터 시작하므로, 빈공간을 체크하기 위해서 Integer 배열을 사용 
        
        for(int i=0; i<n; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<=i; j++)
            {
                triangle[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
       for(int i=0; i<n; i++)
       {
           //가장 마지막 행의 값들을 memo의 마지막행에도 똑같이 복사
           memo[n-1][i] = triangle[n-1][i];
       }
       
        bw.write(df(0,0)+"");
        
        bw.flush();
        bw.close();
        
    }
    
}
