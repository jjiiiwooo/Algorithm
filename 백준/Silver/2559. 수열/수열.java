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
        
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        int num[] = new int[n];
        
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++)
        {
            num[i] = Integer.parseInt(st.nextToken());
        }
        
        int max = Integer.MIN_VALUE;
        int sum = 0;
        
        for(int i=0; i<k; i++)
        {
            sum+=num[i];
        }
        
        max = Math.max(sum,max);
        
        for(int i=k; i<n; i++)
        {
            sum -= num[i-k];
            sum += num[i];
            max = Math.max(sum,max);
        }
        
        bw.write(max+"");
        
        bw.flush();
        bw.close();
    }
}