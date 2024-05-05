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
			int answer[] = new int[8];


				while(N>=50000)
				{
					N = N-50000;
					answer[0]++;
				}
				while(N>=10000)
				{
					N = N-10000;
					answer[1]++;
				}
				while(N>=5000)
				{
					N=N-5000;
					answer[2]++;
				}
				while(N>=1000)
				{
					N=N-1000;
					answer[3]++;
				}
				while(N>=500)
				{
					N=N-500;
					answer[4]++;
				}
				while(N>=100)
				{
					N=N-100;
					answer[5]++;
				}
				while(N>=50)
				{
					N=N-50;
					answer[6]++;
				}
				while(N>=10)
				{
					N=N-10;
					answer[7]++;
				}
				
				System.out.printf("#%d\n",t);
				for(int i=0; i<8; i++)
				{
					System.out.print(answer[i]+" ");
				}
				System.out.println();
			}
		}
		
	}
