import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        Queue<Integer>Input = new LinkedList<>();
        Stack<Integer>Wait = new Stack<>();
        
        int num = Integer.parseInt(br.readLine());
        int order = 1; 
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<num; i++)
        {
            Input.offer(Integer.parseInt(st.nextToken()));
        }
        
        while(!Input.isEmpty())
        {
            if(Input.peek() == order)
            {
                Input.poll();
                order++;
            }
            else if(!Wait.isEmpty() && Wait.peek() == order)
            {
                Wait.pop();
                order++;
            }
            else
            {
                Wait.push(Input.poll());
            }
        }
        
        while(!Wait.isEmpty() && Wait.peek() == order) {
            Wait.pop();
            order++;
        }
        
       
        if(Wait.isEmpty())
        {
            bw.write("Nice");
        }
        else
        {
            bw.write("Sad");
        }
        
        bw.flush();
        bw.close();
    }
}