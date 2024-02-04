import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        long num = sc.nextLong();
        
        long bottom = num+3;
        long rest = 3*(num-1);
        
        System.out.println(bottom+rest);
        
    }
}