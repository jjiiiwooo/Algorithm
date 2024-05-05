import java.util.*;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); 
        
        for (int t = 1; t <= T; t++) { 
            int N = sc.nextInt(); 
            int M = sc.nextInt(); 
            
            int A[] = new int[N]; 
            int B[] = new int[M]; 
            

            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            

            for (int i = 0; i < M; i++) {
                B[i] = sc.nextInt();
            }
            
            int answer = 0; 
            // 각 위치에서의 내적 값을 계산하고 최대값을 찾음
            for (int i = 0; i <= Math.abs(N - M); i++) {
                int sum = 0; 
                for (int j = 0; j < Math.min(N, M); j++) {
                    if (N > M) { // 첫 번째 숫자열의 길이가 더 긴 경우
                        sum += A[i + j] * B[j]; 
                    } else { // 두 번째 숫자열의 길이가 더 긴 경우
                        sum += A[j] * B[i + j]; 
                    }
                }
                answer = Math.max(answer, sum); 
            }
            

            System.out.printf("#%d %d\n", t, answer);
        }
    }
}