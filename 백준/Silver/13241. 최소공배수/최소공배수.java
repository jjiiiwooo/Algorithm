import java.util.Scanner;

public class Main {
    //최대 공약수 
    public static long gcd(long a, long b)
    {
        if(b==0)
        {
            return a;
        }
        else
        {
            return gcd(b,a%b);
        }
    }
    
    //최소 공배수 
    public static long lcm(long a, long b)
    {
        long gcd = gcd(a,b);
        return (a*b)/gcd;
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        long a = sc.nextLong();
        long b = sc.nextLong();
        
        System.out.println(lcm(a,b));
       

    }
}