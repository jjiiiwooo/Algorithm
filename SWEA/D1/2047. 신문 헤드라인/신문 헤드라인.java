import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{	
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<str.length(); i++)
		{
			char cur = str.charAt(i);
			
			if(Character.isAlphabetic(cur))
			{
				sb.append(String.valueOf(cur).toUpperCase());
			}
			else
			{
				sb.append(String.valueOf(cur));
			}
		}
		
		System.out.println(sb.toString());
	}
}