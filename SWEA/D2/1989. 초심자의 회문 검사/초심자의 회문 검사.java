import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{	
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		boolean check = false;
		for(int t=1; t<=T; t++)
		{
			String str = sc.next();
			int answer = 0;
			
			String reverseStr = new StringBuilder(str).reverse().toString();
			
            answer = (str.equals(reverseStr))?1:0;

			System.out.printf("#%d %d\n",t,answer);
		}
	}
}