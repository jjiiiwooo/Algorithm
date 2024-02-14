import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        Queue<Integer> queue = new LinkedList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        for(int i=1; i<=n; i++)
        {
            queue.add(i);
        }
        
        bw.write("<");
        
        while(queue.size()>1)
        {
            for(int i=0; i<k-1; i++)
            {
                int temp = queue.poll();
                queue.add(temp);
            }
            
            bw.write(queue.poll()+"");
            bw.write(", ");
        }
        
        bw.write(queue.poll()+"");
        bw.write(">");
        
        
        bw.flush();
        bw.close();
        
    }
}