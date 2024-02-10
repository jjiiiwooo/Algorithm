import java.util.Scanner;

public class Main {
    //최대 공약수 
    public static int gcd(int a, int b)
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
    public static int lcm(int a ,int b)
    {
        int gcd = gcd(a,b);
        return (a*b)/gcd;
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        
        int bunmo = lcm(a2,b2);
        
        int temp1 = bunmo/a2;
        int temp2 = bunmo/b2;
        
        int bunja = (a1*temp1)+(b1*temp2); //분자의 합
        
        int gcd = gcd(bunja,bunmo);
        
        //기약 분수로 만들기 위해서 두 수의 최대 공약수를 나눠 줌 
        System.out.println((bunja/gcd)+" "+(bunmo/gcd));   
        
    }
}