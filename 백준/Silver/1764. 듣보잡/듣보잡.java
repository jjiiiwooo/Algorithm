import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;


public class Main {
    public static void main(String[] args) throws IOException
    {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        HashSet<String> set = new HashSet<String>();
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        
        for(int i=0; i<n; i++)
        {
            set.add(br.readLine());
        }
        
        int m = Integer.parseInt(st.nextToken());
        
        
        ArrayList<String> result= new ArrayList<String>();
        
        for(int i=0; i<m; i++)
        {
            String key = br.readLine();
            
            if(set.contains(key))
            {
                result.add(key);
            }
        }
        
        Collections.sort(result);
        
        bw.write(result.size()+"\n");
        for(int i=0; i<result.size();i++)
        {
            bw.write(result.get(i));
            bw.newLine();
        }
        
        bw.flush();
        bw.close();

    }
}