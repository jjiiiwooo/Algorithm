import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        HashSet<String> set = new HashSet<String>();
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int count = 0; //포함된 개수 
        
        for(int i=0; i<n; i++)
        {
            set.add(br.readLine());
        }
        
        int m = Integer.parseInt(st.nextToken());
        
        for(int i=0; i<m; i++)
        {
            if(set.contains(br.readLine()))
            {
                count++;
            }
        }
        
        bw.write(count+"");
        
        bw.flush();
        bw.close();
    }
}