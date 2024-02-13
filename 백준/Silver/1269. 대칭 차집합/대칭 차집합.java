import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        HashSet<Integer> set = new HashSet<Integer>();
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++)
        {
            set.add(Integer.parseInt(st.nextToken()));
        }
        
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<m; i++)
        {
            int key = Integer.parseInt(st.nextToken());
            
            if(set.contains(key))
            {
                set.remove(key);
            }
            else
            {
                set.add(key);
            }
        }
        
        bw.write(set.size()+"");
        
        bw.flush();
        bw.close();
    }
        
}