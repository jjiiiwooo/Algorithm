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
			
			int pascal[][] = new int[N][];
			
			for(int i=0; i<N; i++)
			{
				pascal[i] = new int[i+1];
				
				//규칙 1. 각 행의 첫 번째 숫자는 1
				pascal[i][0] = 1;
				pascal[i][i] = 1;
				
				//규칙 2. 중간에 위치한 숫자는 자신의 왼쪽과 오른쪽 위의 숫자의 합으로 구성
				for(int j=1; j<i; j++)
				{
					pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j];
				}
			}
			
			System.out.printf("#%d\n",t);
			//출력
			for(int i=0; i<pascal.length; i++)
			{
				for(int j=0; j<pascal[i].length; j++)
				{
					System.out.print(pascal[i][j]+" ");
				}
				System.out.println();
			}
		}	
	}
}