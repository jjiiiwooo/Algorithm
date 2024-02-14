import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        Queue<Integer> queue = new LinkedList<>();
        
        
        int n = Integer.parseInt(br.readLine());
        
        for(int i=1; i<=n; i++)
        {
            queue.add(i);
        }
        
        
        while(queue.size()>1)
        {
        	queue.remove();
            int temp = queue.remove();
            queue.add(temp);
        }
        
        bw.write(queue.peek()+"");
        
        bw.flush();
        bw.close();
    }
}