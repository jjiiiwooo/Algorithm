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
        
        set.add("ChongChong");
        for(int i=0; i<n; i++)
        {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	
            String person = st.nextToken();
            String friend= st.nextToken();
            
            if(set.contains(person) || set.contains(friend))
            {
            	set.add(person);
            	set.add(friend);
            }

        } 
        
        bw.write(set.size()+"");
        bw.flush();
        bw.close();
        
    }
}