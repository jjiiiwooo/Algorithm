import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(br.readLine());
        
        for(int i=0; i<num; i++)
        {
            String s = br.readLine();
            //각 테스트 케이스마다 새로운 스택 생성
            Stack<Character> stack = new Stack<Character>();
            boolean check = true;
            
            for(int j=0; j<s.length(); j++)
            {
                if(s.charAt(j)=='(') //왼쪽 괄호를 만났을 경우 푸시
                {
                    stack.push(s.charAt(j));
                }
                else if(stack.isEmpty()) //오른쪽 괄호를 만났는데 스택이 비어있는 경우 
                {
                	check=false;
                }
                else //오른쪽 괄호를 만났을 때 짝이 맞는 경우 
                {
                	stack.pop();
                } 
            }
          //모든 문자열 검사를 마쳤는데 스택에 남은 왼쪽 괄호가 있을 경우 NO
            if(!stack.isEmpty())
            {
            	check=false;
            	
            }
            
            if(check)
            	System.out.println("YES");
            else
            	System.out.println("NO");
            
        }
        
        
    }
}