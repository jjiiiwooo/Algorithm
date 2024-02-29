import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int m;
   
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st;
        st= new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        
        int sum [] = new int[n+1]; //합 배열
        
        st= new StringTokenizer(br.readLine());
        for(int i=1; i<=n; i++)
        {
            int num = Integer.parseInt(st.nextToken());
            
            //새 입력이 들어올 때마다 sum[i-1]에 더해서 sum[i]에 대입
            sum[i] = sum[i-1]+num;
        }
        
        for(int i=0; i<m; i++)
        {
           st = new StringTokenizer(br.readLine());
           int a = Integer.parseInt(st.nextToken());
           int b = Integer.parseInt(st.nextToken());
           
           int result = sum[b] - sum[a-1];
       
           bw.write(result+"");
           bw.newLine();
            
        }
        
        bw.flush();
        bw.close();
    }
}