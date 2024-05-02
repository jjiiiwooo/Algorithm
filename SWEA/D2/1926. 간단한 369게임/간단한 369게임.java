import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{	
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int idx = 0;
		
		StringBuilder answer = new StringBuilder();
		String str[] = new String[N];
		
		for(int i=1; i<=N; i++)
		{
			str[idx++] = String.valueOf(i);
		}
		
		for(int i=0; i<str.length; i++)
		{
			if(str[i].contains("3")||str[i].contains("6")||str[i].contains("9"))
			{
				for(int j=0; j<str[i].length(); j++)
				{
					if(str[i].charAt(j)=='3'||str[i].charAt(j)=='6'||str[i].charAt(j)=='9')
					{
						answer.append("-");						
					}
				}
				answer.append(" ");
			}
			else
			{
				answer.append(str[i]).append(" ");
			}
		}
		
		System.out.println(answer.toString());

	}
}
