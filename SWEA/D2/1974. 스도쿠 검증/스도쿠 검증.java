import java.util.*;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        for(int t = 1; t <= T; t++) {
            int sudoku[][] = new int[9][9];
            int answer = 1; // 초기값을 1로 설정
            
            // 입력 받기
            for(int i = 0; i < 9; i++) {
                for(int j = 0; j < 9; j++) {
                    sudoku[i][j] = sc.nextInt();
                }
            }
            
            // 가로 검사
            for(int i = 0; i < 9; i++) {
                boolean[] seen = new boolean[10]; // 숫자 1부터 9까지의 등장 여부를 나타내는 배열
                
                for(int j = 0; j < 9; j++) {
                    int num = sudoku[i][j];
                    if(seen[num]) { // 이미 등장한 숫자일 경우
                        answer = 0;
                        break;
                    } else {
                        seen[num] = true; // 숫자 등장 표시
                    }
                }
                if(answer == 0) break; // 중복이 발견되면 반복 중지
            }
            
            // 세로 검사
            for(int j = 0; j < 9; j++) {
                boolean[] seen = new boolean[10];
                
                for(int i = 0; i < 9; i++) {
                    int num = sudoku[i][j];
                    if(seen[num]) {
                        answer = 0;
                        break;
                    } else {
                        seen[num] = true;
                    }
                }
                if(answer == 0) break;
            }
            
            // 3x3 작은 격자 검사
            for(int block = 0; block < 9; block++) {
                boolean[] seen = new boolean[10];
                
                int rowOffset = (block / 3) * 3;
                int colOffset = (block % 3) * 3;
                
                for(int i = 0; i < 3; i++) {
                    for(int j = 0; j < 3; j++) {
                        int num = sudoku[rowOffset + i][colOffset + j];
                        if(seen[num]) {
                            answer = 0;
                            break;
                        } else {
                            seen[num] = true;
                        }
                    }
                    if(answer == 0) break;
                }
                if(answer == 0) break;
            }
            
            System.out.printf("#%d %d\n", t, answer);
        }
    }
}
