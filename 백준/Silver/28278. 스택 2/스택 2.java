import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Stack;

public class Main {
   public static void main(String[] args) throws IOException
   {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	   
	   
	   Stack<Integer>stack = new Stack<>();
	   
	   int n = Integer.parseInt(br.readLine());
	   
	   for(int i=0; i<n; i++)
	   {
		   String s = br.readLine();
		   StringTokenizer st = new StringTokenizer(s);
		   
		   switch(st.nextToken())
		   {
		   case "1": //푸시
			   stack.push(Integer.parseInt(st.nextToken()));
			   break;
		   case "2": //팝
			   if(stack.isEmpty())
			   {
				   bw.write(-1+"");
				   bw.newLine();
			   }   	
			   else
			   {
				   bw.write(stack.pop()+"");
				   bw.newLine();
			   }
			   break;
		   case "3": //스택 사이즈
			   bw.write(stack.size()+"");
			   bw.newLine();
			   break;
		   case "4": //스택이 비어 있는가?
			   if(stack.isEmpty())
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
		   case "5": //피크
			   if(stack.isEmpty())
			   {
				   bw.write(-1+"");
				   bw.newLine();
			   }
			   else
			   {
				   bw.write(stack.peek()+"");
				   bw.newLine();
			   }
			   break;

		   }
	   }
	   
	   bw.flush();
	   bw.close();
	   
	   
   }
}