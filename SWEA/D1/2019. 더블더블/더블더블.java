import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{	
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		System.out.print(1+" ");
		for(int i=1; i<=N; i++)
		{
			System.out.print((int)Math.pow(2,i)+" ");
		}
	}
}