import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int T =sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++)
		{
			int N = sc.nextInt(); //반지름 
			int answer =0;
			
			for(int i=-N; i<N+1; i++)
			{
				for(int j=-N; j<N+1; j++)
				{
					if(Math.pow(i,2)+Math.pow(j,2)<=Math.pow(N,2))
					{
						answer++;
					}
				}
			}
			System.out.printf("#%d %d\n",tc,answer);
		}
	}
}