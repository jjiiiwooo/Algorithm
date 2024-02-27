import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    
    
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int stairs[] = new int[n+1];
        int memo[] = new int[n+1];
        
        for(int i=1; i<=n; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            stairs[i] = Integer.parseInt(st.nextToken());
        }
        
        memo[1] = stairs[1];
        
        //n이 1이 입력될 수도 있기 때문에 예외처리
        if(n>=2)
        {
            memo[2] = stairs[1] + stairs[2];
        }
        
        for(int i=3; i<=n; i++)
        {
            memo[i] = Math.max(memo[i-2], memo[i-3]+stairs[i-1])+stairs[i];
        }
        
        bw.write(memo[n]+"");
        
        bw.flush();
        bw.close();
        
    }
}
