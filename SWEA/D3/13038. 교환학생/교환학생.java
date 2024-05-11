import java.util.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int T =sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++)
		{
			int N = sc.nextInt(); //들어야 하는 수업 수 
			
			int arr[] = new int[7];
			//수업 입력받기
			for(int i=0; i<7; i++)
			{
				arr[i] = sc.nextInt();
			}
			
			int answer = Integer.MAX_VALUE;
			for(int i=0; i<7; i++)
			{
				if(arr[i]==0)
					continue;
				int count=0; 
				int start = i; //시작 요일
				
				while(true)
				{
					//현재 요일에 수업이 있는 경우
					if(arr[start%7]==1)
						count++;
					start++; //다음 요일로 이동
					
					//필요한 수업 수를 모두 들은 경우 
					if(count==N)
					{
						answer = Math.min(answer, start-i);
						break;
					}
				}
			}
			
			System.out.printf("#%d %d\n",tc,answer);
		}
	}
}