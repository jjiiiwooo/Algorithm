import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
         
        if((a==b)&&(b==c))
        {
            System.out.println(10000+a*1000);
        }
        else if((a!=b)&&(b!=c)&&(a!=c))
        {
            int max = a;
            if(b>max)
                max = b;
            if(c>max) 
                max =c;
            System.out.println(max*100);
        }
        else{
            if(a!=b)
            {
                System.out.println(1000+(100*c));
            }
            else if(a!=c)
            {
                System.out.println(1000+(100*b));
            }
        }
        sc.close();
    }
}