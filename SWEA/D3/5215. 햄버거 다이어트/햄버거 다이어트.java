import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int t=1; t<=T; t++) {
			
			int N = sc.nextInt(); //재료의 수
			int L = sc.nextInt(); //제한 칼로리
			//주어진 제한  칼로리 이하의 조합중에서 가장 맛에 대한 점수가 높은 햄버거의 점수를 출력
			
			int scores[] = new int[N];
			int calories[] = new int[N];
			
			for(int i=0; i<N; i++)
			{
				scores[i] = sc.nextInt();
				calories[i] = sc.nextInt();
				
			}
			
			//각 칼로리 제한에서의 최대 점수를 저장할 db 배열 생성
			int memo[] = new int[L+1];
			
			
			//현재 재료를 고려하여 dp 배열 업데이트
			for(int i=0; i<N; i++)
			{
				for(int j=L; j>=calories[i]; j--)
				{
					//현재 칼로리 제한에서 최대 점수를 반영하도록 dp 배열 업데이트
					
					memo[j] = Math.max(memo[j],memo[j-calories[i]]+scores[i]);
				}
			}
			
			int answer = memo[L];
			
			
			System.out.printf("#%d %d\n", t, answer);
		}
	}
}