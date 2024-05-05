import java.util.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{	
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++)
		{
			
			int N = sc.nextInt();
			int num[] = new int[N];
			
			for(int i=0; i<N; i++)
			{
				num[i] = sc.nextInt();
			}
			
			Arrays.sort(num); //오름차순 정렬 
			
			System.out.printf("#%d ",t);
			for(int n : num)
			{
				System.out.print(n+" ");
			}
			System.out.println();
			
		}
		
	}
}