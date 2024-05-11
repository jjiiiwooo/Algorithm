import java.util.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		
		for(int testcase = 1; testcase <=10; testcase++)
		{
			int tc = sc.nextInt();
			String find = sc.next(); //찾아야 하는 단어
			String s = sc.next(); //검색할 문장
			int answer=0;
			
			for(int i=0; i<=s.length()-find.length(); i++)
			{
				String sub = s.substring(i,i+find.length());
				if(sub.equals(find))
				{
					answer++;
				}
			}
			
			System.out.printf("#%d %d\n",testcase,answer);
		}
	}
}