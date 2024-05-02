import java.util.Scanner;
import java.util.Stack;


class Solution
{
	public static void main(String args[]) throws Exception
	{	
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++)
		{
			int N = sc.nextInt();
			long answer = 0;
			
			Stack<Integer> stack = new Stack<>();	
			
			//N개의 수 만큼 스택에 push
			for(int i=0; i<N; i++)
			{
				stack.push(sc.nextInt());
			}
			
			int max = 0;
			while(!stack.isEmpty())
			{
				int price = stack.pop();
				if(price <max)
				{
					answer +=max-price;
				}
				else
				{
					max = price;
				}
			}
			
			System.out.printf("#%d %d\n",t,answer);
			
		}
	}
}