import java.util.Scanner;

/*
최댓값을 구해야하기에 입력받은 숫자보다 큰 숫자가 될 때까지
1부터 계속 더한 후, 더 큰 숫자가 되었을 때 초과한 만큼의 숫자만 빼주면
됨 */

public class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        long num = sc.nextLong();
        long sum = 0L;
        int a = 1;
        
        while(sum<=num)
        {
            sum = sum+a++;
        }
        
        System.out.println(a-2);
        
        sc.close();
    }
}