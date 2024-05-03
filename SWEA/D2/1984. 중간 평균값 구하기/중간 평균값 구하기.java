import java.util.Scanner;
import java.util.Arrays;

class Solution
{
	public static void main(String args[]) throws Exception
	{	
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++)
		{
			int answer =0;
			
			int num[] = new int[10];
			
			for(int i=0; i<10; i++)
			{
				num[i] = sc.nextInt();
			}
			
			Arrays.sort(num);
			
			int newArr[] = Arrays.copyOfRange(num,1,9);
			
			int sum = 0;
			for(int i=0; i<newArr.length; i++)
			{
				sum+=newArr[i];
			}
			
			answer = (int)Math.round((double)sum/newArr.length);

			System.out.printf("#%d %d\n",t,answer);
		}
	}
}