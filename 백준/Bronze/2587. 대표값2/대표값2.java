import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int n[] = new int[5];
        int sum = 0;
        
        for(int i=0; i<5; i++)
        {
            n[i] = sc.nextInt();
            sum += n[i];
        }
        
        Arrays.sort(n);
        
        System.out.println(sum/5); //평균
        System.out.println(n[2]); //중앙값
        
        
    }
}