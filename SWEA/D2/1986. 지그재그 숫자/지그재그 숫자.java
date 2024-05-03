import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{	
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++)
		{
			int answer = 0;
			
			int N = sc.nextInt();
			
			for(int i=1; i<=N; i++)
			{
				if(i%2==0)
				{
					answer-=i;
				}
				else
				{
					answer +=i;
				}
			}	
			System.out.printf("#%d %d\n",t,answer);
		}
	}
}