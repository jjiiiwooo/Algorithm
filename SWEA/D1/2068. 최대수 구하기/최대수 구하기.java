import java.util.Scanner;
import java.util.Arrays;

class Solution
{
	public static void main(String args[]) throws Exception
	{	
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		
		int num[] = new int[10];
		for(int t = 1; t <= T; t++)
		{
			for(int i=0; i<10; i++)
			{
				num[i] = sc.nextInt();
			}
			Arrays.sort(num);
			
			System.out.printf("#%d %d\n",t,num[num.length-1]);
		}
		
	}
}
