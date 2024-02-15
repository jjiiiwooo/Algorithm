import java.util.Scanner;

public class Main 
{
    static int factorial(int n)
    {
        return (n>0)? n*factorial(n-1):1;
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        System.out.println(factorial(n));
    }
}