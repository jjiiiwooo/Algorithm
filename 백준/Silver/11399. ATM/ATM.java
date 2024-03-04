import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int time[] = new int[n];
        
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++)
        {
            time[i] = Integer.parseInt(st.nextToken());
        }
        
        //인출 시간이 적은 순으로 정렬 
        Arrays.sort(time);

        
        int prefix =0;
        int result =0;
        for(int i=0;i<n; i++)
        {
            result += prefix+time[i];
            
            prefix +=time[i];
        }
       
        bw.write(result+"");
        bw.flush();
        bw.close();
        
        
    }
}
