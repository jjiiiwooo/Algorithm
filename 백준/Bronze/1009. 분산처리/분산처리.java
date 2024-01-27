import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        int a,b,div;
        for(int i=0; i<num; i++)
        {
            a = sc.nextInt();
            b = sc.nextInt();
            div = 1;
            
            for(int j=0; j<b; j++)
            {
                div = a*div%10;
            }
              if(div==0) div = 10;
              System.out.println(div);
        }
        
        sc.close();
    }
}