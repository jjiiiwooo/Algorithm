import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);

		for(int tc = 1; tc <= 10; tc++)
		{
		
			int N = sc.nextInt(); //건물의 개수 

			int height[] = new int[N]; //건물의 높이 
			int answer = 0; //조망권이 확보된 세대 
			
			//입력받기
			for(int i=0; i<height.length; i++)
			{
				height[i] = sc.nextInt();
			}
			
            for (int i = 2; i < N - 2; i++) {
                int max = Math.max(height[i - 2], Math.max(height[i - 1], Math.max(height[i + 1], height[i + 2])));
                if (height[i] - max > 0) // 좌 우 건물 높이의 최댓값보다 현재 건물의 높이가 높으면
                    answer += height[i] - max; 
            }
			
            System.out.printf("#%d %d\n",tc,answer);		
		}
	}
}