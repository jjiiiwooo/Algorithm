import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(true)
        {
        	String s = br.readLine();
        	
        	Stack<Character>stack = new Stack<Character>();
        	boolean check=true;
        	
        	if(s.equals(".")) 
        		break;
        	
        	for(int i=0; i<s.length(); i++)
        	{
        		char c = s.charAt(i);
        		
        		//왼쪽 괄호들을 만나면 스택에 푸시 
        		if(c=='('||c=='[')
        		{
        			stack.push(c);
        		}
        		
        		//오른쪽 ')'을 만났을 때
        		else if(c==')')
        		{
        			//스택이 비어 있거나 '['인 경우에는 check false
        			if(stack.isEmpty()|| stack.peek()!='(')
        			{
        				check=false;
        			}
        			else
        			{
        				stack.pop();
        			}
        		}
        		
        		//오른쪽 ']'을 만났을 때
        		else if(c==']')
        		{
        			//스택이 비어 있거나 '('인 경우에는 check false
        			if(stack.isEmpty() || stack.peek()!='[')
        			{
        				check=false;
        			}
        			else
        			{
        				stack.pop();
        			}
        		}
        		
        	}
        	
        	
        	//모든 검사를 마쳤는데 스택에 남은 괄호가 있을 경우 
        	if(!stack.isEmpty())
        	{
        		check=false;
        	}
        	
        	
        	if(check)
        	{
        		System.out.println("yes");
        	}
        	else
        	{
        		System.out.println("no");
        	}
        	
        }
    }
}