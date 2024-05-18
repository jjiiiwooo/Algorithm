import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int t=1; t<=T; t++) {
			String memory = sc.next(); //목표 메모리 상태
			char cur[] = memory.toCharArray();
			int answer =0;
			
			//초기 메모리 상태 '0'으로 초기화
			for(int i=0; i<cur.length; i++)
			{
				cur[i]='0';
			}
			
			//현재 메모리와 목표 메모리를 비교하여 answer 계산
			for(int i=0; i<memory.length(); i++)
			{
				if(cur[i]!=memory.charAt(i))
				{
					answer++;
					//연속된 부분 한 번에 변경
					for(int j=1; j<memory.length();j++)
					{
						cur[j] = memory.charAt(i);
					}
				}
			}
			System.out.printf("#%d %d\n", t, answer);
		}
	}
}