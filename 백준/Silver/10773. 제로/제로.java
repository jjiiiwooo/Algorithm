import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
   public static void main(String[] args) throws IOException
   {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       
       Stack<Integer> stack = new Stack<>();
       
       int num = Integer.parseInt(br.readLine());
       int result[] = new int[num];
       
       for(int i=0; i<num; i++)
       {
           int input = Integer.parseInt(br.readLine());
           
           if(input==0)
           {
               if(!stack.isEmpty())
               {
                   stack.pop();
               }
           }
           else
           {
               stack.push(input);
           }
       }
       
       int sum = 0;
       for(int i=0; i<num; i++)
       {
           if(!stack.isEmpty())
        	   result[i] = stack.pop();
           sum+=result[i];
       }

       bw.write(sum+"");
       
       bw.flush();
       bw.close();
           
   }
}