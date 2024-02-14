import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.LinkedList;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        Deque<Integer> queue = new LinkedList<>();
        
        int n = Integer.parseInt(br.readLine());
        
        for(int i=0; i<n; i++)
        {
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);
            
            switch(st.nextToken())
            {
                case "push":
                    queue.offer(Integer.parseInt(st.nextToken()));
                    break;
                    
                case "pop":
                    Integer e0 = queue.poll();
                    if(e0 == null)
                    {
                        bw.write(-1+"");
                        bw.newLine();
                    }
                    else
                    {
                        bw.write(e0+"");
                        bw.newLine();
                    }
                    break;
                    
                case "size":
                    bw.write(queue.size()+"");
                    bw.newLine();
                    break;
                    
                case "empty":
                    if(queue.isEmpty())
                    {
                        bw.write(1+"");
                        bw.newLine();
                    }
                    else
                    {
                        bw.write(0+"");
                        bw.newLine();
                    }
                    break;
                    
                case "front":
                    Integer e1 = queue.peek();
                    if(e1==null)
                    {
                        bw.write(-1+"");
                        bw.newLine();
                    }
                    else
                    {
                        bw.write(e1+"");
                        bw.newLine();
                    }
                    break;
                    
                case "back":
                   Integer e2 = queue.peekLast();
                   if(e2==null)
                   {
                       bw.write(-1+"");
                       bw.newLine();
                   }
                    else
                    {
                        bw.write(e2+"");
                        bw.newLine();
                    }
                    break;
            }

        }
        
        bw.flush();
        bw.close();
    }
}