import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{	
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		char ch[] = str.toCharArray();
		int num[] = new int[ch.length];
		
		for(int i=0; i<ch.length; i++)
		{
			//A 아스키 코드 65
			num[i] = (int)(ch[i]-64);
		}
		
		for(int i=0; i<num.length; i++)
		{
			System.out.print(num[i]+" ");
		}
	}
}