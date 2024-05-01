import java.util.Scanner;
import java.util.ArrayList;

class Solution
{
	public static void main(String args[]) throws Exception
	{	
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		
		int N = sc.nextInt();
		
		for(int i=1; i<=N; i++)
		{
			if(N%i==0)
			{
				list.add(i);
			}
		}
		
		for(int n : list)
		{
			System.out.print(n+" ");
		}
	}
}