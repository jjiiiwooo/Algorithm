import java.util.*;

public class Solution {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for (int t=1; t<=10; t++) {
			sc.nextInt();
			int arr[][] = new int[100][100];
			int answer = -1; //각 행의 합, 각 열의 합, 각 대각선의 합 중 최대값 
			
			for(int i=0; i<100; i++)
			{
				for(int j=0; j<100; j++)
				{
					arr[i][j]= sc.nextInt();
				}
			}
			
			int sum_row = 0; //각 열의 합
			int sum_col = 0; //각 행의 합
			int sum_dia1 = 0; // 각 \ 대각선 합
			int sum_dia2 = 0; // 각 / 대각선 합 
			
			//각 열의 합
			for(int i=0; i<100; i++)
			{
				int temp=0;
				for(int j=0; j<100; j++)
				{
					temp+=arr[i][j];
				}
				sum_row = Math.max(sum_row,temp);
			}
			
			//각 행의 합
			for(int i=0; i<100; i++)
			{
				int temp=0;
				for(int j=0; j<100; j++)
				{
					temp+=arr[j][i];
				}
				sum_col = Math.max(sum_col,temp);
			}
			
			// 각 \ 대각선 합
			for(int i=0; i<100; i++)
			{
				sum_dia1+=arr[i][i];
			}
			
			
			//각 / 대각선 합
			for(int i=0; i<100; i++)
			{
				sum_dia2+=arr[i][99-i];
			}
			
			answer = Math.max(sum_row, Math.max(sum_col, Math.max(sum_dia1, sum_dia2)));
			
			System.out.printf("#%d %d\n", t, answer);
		}
	}
}
