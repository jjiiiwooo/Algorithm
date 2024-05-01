import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{	
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int answer = 0;
		
		while(N>0)
		{
			answer += N%10;
			N = N/10;
		}
		
		System.out.println(answer);

	}
}