import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a[]= new int[3];
    
        while(true)
        {
            a[0] = sc.nextInt();
            a[1] = sc.nextInt();
            a[2] = sc.nextInt();
            
            if((a[0]==0)&&(a[1]==0)&&(a[2]==0))
            {
            	break;
            }
            
            Arrays.sort(a);
            
            if(a[2]>=a[0]+a[1])
            {
               System.out.println("Invalid");
            }
            else if((a[0]==a[1])&&(a[1]==a[2]))
            {
                System.out.println("Equilateral");
            }
            else if((a[0]==a[1])||(a[0]==a[2])||(a[1]==a[2]))
            {
              System.out.println("Isosceles");
            }
            else 
             {
                   System.out.println("Scalene");
                }
            }
            

        
    }
}