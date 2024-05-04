import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{	
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++)
		{
			int t1 = sc.nextInt();
			int m1 = sc.nextInt();
			int t2 = sc.nextInt();
			int m2 = sc.nextInt();
			
			int sum = ((t1*60)+m1)+((t2*60)+m2);
			
			int ans_t=0;
			int ans_n=0;
			
			if(sum/60>12)
			{
				ans_t = sum/60-12;
			}
			else
			{
				ans_t = sum/60;
			}
			
			ans_n = sum%60;
			
			System.out.printf("#%d %d %d\n", t,ans_t,ans_n);
				
		}
	}
}