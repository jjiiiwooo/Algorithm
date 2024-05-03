import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{	
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++)
		{
			int N = sc.nextInt(); //해당 영역
			int M = sc.nextInt(); //파리채 영역

			int space[][] = new int[N][N];
			
			//파리 개수 입력받기
			for(int i=0; i<space.length;i++)
			{
				for(int j=0; j<space[i].length; j++)
				{
					space[i][j] = sc.nextInt();
				}
			}
			
			//i,j는 0부터 N-M까지
			//space(i,i+M)~ space(j,j+M)의 누적합 중 가장 큰 값 반환
			int max = Integer.MIN_VALUE;
			
			for(int i=0; i<=N-M; i++)
			{
				for(int j=0; j<=N-M; j++)
				{
					//부분합의 누적합 구하기 
					int sum = 0;
					for(int x=i; x<i+M; x++)
					{
						for(int y=j; y<j+M; y++)
						{
							sum+=space[x][y];
						}
					}
					
					max = Math.max(max,sum);
				}
			}
			
			System.out.printf("#%d %d\n",t,max);			
		}
		
	}
}