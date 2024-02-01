import java.util.Scanner;

/*
단순히 한 변에 존재하는 점의 개수만 구하면 됨
A=2*A-1가 반복
초기 상태 점의 개수 4(2^2)
점을 1번 찍은 경우 9(3^2)
점을 2번 찍은 경우 25(5^2)
점을 3번 찍은 경우 (5+4)^2인 81
점을 4번 찍은 경우 (9+8)^2인 289
점을 5번 찍은 경우 (17+16)^2인 1089

*/

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        System.out.println((int)(Math.pow(Math.pow(2,num)+1,2)));
        
    }
}