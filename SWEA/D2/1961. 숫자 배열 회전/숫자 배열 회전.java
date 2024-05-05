import java.util.*;

class Solution
{
	//배열 회전 함수 
	static int[][] Circle(int num[][])
	{
		int len = num.length;
		int result[][] = new int[len][len];
		
		ArrayList<Integer>list = new ArrayList<>();
		for(int i=0; i<len; i++)
		{
			for(int j=len-1; j>=0; j--)
			{
				list.add(num[j][i]);
			}
		}
		
		//2차원 배열에 저장
		int idx =0;
		for(int i=0; i<len; i++)
		{
			for(int j=0; j<len; j++)
			{
				result[i][j] = list.get(idx++);
			}
		}
		
		return result;
	}
	
	public static void main(String args[]) throws Exception
	{	
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++)
		{
			
			int N = sc.nextInt();
			int num[][] = new int[N][N];
			
			//입력 
			for(int i=0; i<N; i++)
			{
				for(int j=0; j<N; j++)
				{
					num[i][j] = sc.nextInt();
				}
			}
			
			int arr1[][] = Circle(num); //90도 회전
			int arr2[][] = Circle(arr1); //180도 회전
			int arr3[][] = Circle(arr2); //270도 회전 
			
			
			System.out.printf("#%d\n", t);
			for(int i = 0; i < N; i++)
			{
				
				for(int j = 0; j < N; j++)
				{
					System.out.print(arr1[i][j]);
				}
				System.out.print(" ");
				
				for(int j = 0; j < N; j++)
				{
					System.out.print(arr2[i][j]);
				}
				System.out.print(" ");
				
				for(int j = 0; j < N; j++)
				{
					System.out.print(arr3[i][j]);
				}
				System.out.println();
			}	
		}
		
	}
}