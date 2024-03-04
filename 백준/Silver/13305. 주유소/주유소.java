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
        
        int n = Integer.parseInt(br.readLine()); //도시의 개수 
        int len[] = new int[100000]; //도로의 길이
        int price[] = new int[100000]; //주유소의 리터당 가격
        long sum = 0;
        long now;
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=1; i<n; i++)
        {
            len[i] = Integer.parseInt(st.nextToken());
        }
        
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++)
        {
            price[i] = Integer.parseInt(st.nextToken());
        }
    
        now = price[0];
        sum = now*len[1];
        
        for(int i=1; i<n; i++)
        {
            if(now<price[i])
            {
                sum+=now*len[i+1];
            }
            else
            {
                now = price[i];
                sum += now*len[i+1];
            }
        }
        
        bw.write(sum+"");
        bw.flush();
        bw.close();

    }
}