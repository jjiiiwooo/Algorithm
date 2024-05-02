import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{	
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++)
		{
			String str = sc.next();
			
			for(int i=1; i<=str.length(); i++)
			{
				String pattern = str.substring(0,i);
				String compare = str.substring(i,i+i);
				
				if(pattern.equals(compare))
				{
					System.out.printf("#%d %d\n",t,pattern.length());
					break;
				}
			}
		}	
	}
}