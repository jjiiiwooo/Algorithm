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
        
        int n = Integer.parseInt(br.readLine());
        
        int total = 0;
        
        
        for(int i=0; i<n; i++)
        {
        	StringTokenizer st = new StringTokenizer(br.readLine());
            String temp = st.nextToken();
            
            if(temp.equals("ENTER"))
            {
                total += set.size();
                set.clear();
            }
            else
            {
                set.add(temp);
            }
        }
        
        total += set.size();
        
        bw.write(total+"");
        
        bw.flush();
        bw.close();
        
    }
}