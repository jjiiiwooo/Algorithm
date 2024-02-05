import java.util.Scanner;

public class Main {
	
	static char board[][];
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		board = new char[N][M];
		sc.nextLine();
		
		for (int i = 0; i < N; i++) {
			String s = sc.nextLine();
			for (int j = 0; j < M; j++) {
				board[i][j] = s.charAt(j);
			}
		}
		
		int ans = 100000;

		for (int i = 0; i < N-7; i++) {
			for (int j = 0; j < M-7; j++) {
				ans = Math.min(ans, getMin(i,j));
			}
		}
		System.out.println(ans);
	}
	
	public static int getMin(int x, int y) {
		int cB = 0; 
		int cW = 0; 
		
		for (int i = x; i < x+8; i++) {
			for (int j = y; j < y+8; j++) {
				if((i + j) % 2 == 0) {
					if(board[i][j] == 'B')
                    {
                        cW++;
                    }
					else
                    {
                        cB++;
                    }
				}
                else
                { 
					if(board[i][j] == 'W'){
                        cW++;
                    }
					else
                    {
                        cB++;
                    }
				}
			}
		}
		return Math.min(cB,cW);
	}
}
    