import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{	
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++)
		{
			int N = sc.nextInt();
			int K = sc.nextInt();
			
			int puzzle[][] = new int[N][N];
			
			for(int i=0; i<puzzle.length; i++)
			{
				for(int j=0; j<puzzle[i].length; j++)
				{
					puzzle[i][j] = sc.nextInt();
				}
			}
			
			int answer = 0;
			
			//가로 체크 
			for(int i=0; i<N; i++)
			{
				int count = 0;
				for(int j=0; j<N; j++)
				{
					if(puzzle[i][j]==1)
					{
						count++;
					}
					//벽을 만났을 때 
					if(puzzle[i][j]==0) 
					{
						if(count==K)
						{
							answer++;
						}
						count=0; //count 초기화후 다음 줄로 이동
					}
				}
				if(count==K) answer++;
			}
			
			//세로 체크
			for(int i=0; i<puzzle.length; i++)
			{
				int count =0;
				for(int j=0; j<puzzle.length; j++)
				{
					if(puzzle[j][i]==1)
					{
						count++;
					}
					//벽을 만났을 때 
					if(puzzle[j][i]==0)
					{
						if(count==K) {
							answer++;
						}
						count=0;//count 초기화후 다음 줄로 이동
					}	
				}
				if(count==K) answer++;
			}
			
			System.out.printf("#%d %d\n",t,answer);
		}
	}
}