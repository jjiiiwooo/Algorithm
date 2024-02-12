import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Collections;


public class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        HashMap<String,String> map = new HashMap<String,String>();
        
        int n = Integer.parseInt(br.readLine());
        
        for(int i=0; i<n; i++)
        {
          StringTokenizer st = new StringTokenizer(br.readLine());
           String name = st.nextToken();
           String log =  st.nextToken();
           
           map.put(name,log);
        }
        
        ArrayList<String> list = new ArrayList<String>();
        for(Map.Entry<String,String>entry : map.entrySet())
        {
            if(entry.getValue().equals("enter"))
            {
                list.add(entry.getKey());
            }
        }
        
        //사전순의 역순으로 정렬
        Collections.sort(list, Collections.reverseOrder());
        
        for(String s : list)
        {
        	bw.write(s+"\n");
        }
        
        bw.flush();
        bw.close();
    }
        
}