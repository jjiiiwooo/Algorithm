import java.util.*;

public class Solution {
	//회문 검사 
	public static boolean isPalindrome(String s){
		//문자열을 뒤집은 다음 String으로 변경
		String reverse = new StringBuilder(s).reverse().toString();
		
		//두 문자열이 동일한지 비교 
		return s.equals(reverse);
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for (int t=1; t<=10; t++) {
			int N = sc.nextInt(); //찾아야 하는 회문의 길이 
			char board[][] = new char[8][8]; //글자판
			int answer = 0; //길이가 N인 회문의 수 
			
			//글자판 입력
			for(int i=0; i<8; i++)
			{
				String line = sc.next();
				for(int j=0; j<8; j++)
				{
					board[i][j] = line.charAt(j);
				}
			}
			
			//가로로 회문 검사, 8개 행 검사 
			for(int i=0; i<8; i++)
			{
				//시작 지점 : 각 행에서 길이가  N인 부분 문자열을 추출할 있는 지점
				for(int j=0; j<=8-N; j++)
				{
					StringBuilder sb = new StringBuilder();
					//시작 지점 j부터 N개의 문자 추출
					for(int k=j; k<j+N; k++)
					{
						sb.append(board[i][k]);
					}
					
					if(isPalindrome(sb.toString()))
					{
						answer++;
					}
				}
			}
			
			//세로로 회문 검사, 8개 열 반복
			for(int j=0; j<8; j++)
			{
				//시작 지점 : 각 열에서 길이가  N인 부분 문자열을 추출할 있는 지점
				for(int i=0; i<=8-N; i++)
				{
					StringBuilder sb = new StringBuilder();
					//시작 지점 i부터 N개의 문자 추출
					for(int k=i; k<i+N; k++)
					{
						sb.append(board[k][j]);
					}
					
					if(isPalindrome(sb.toString()))
					{
						answer++;
					}
				}
			}
 	
			
			System.out.printf("#%d %d\n", t, answer);
		}
	}
}