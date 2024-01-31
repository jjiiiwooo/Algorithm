import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] arrN = new int[N][M];
        int[][] arrM = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arrN[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arrM[i][j] = sc.nextInt();
            }
        }

        int[][] rstArr = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                rstArr[i][j] = arrN[i][j] + arrM[i][j];
                System.out.print(rstArr[i][j]);
                if (j < M - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}