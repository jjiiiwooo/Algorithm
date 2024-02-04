import java.util.Scanner;

public class Main {
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        if(n==1)
            System.out.println();
        int divided = 2;
        while(n>1) {
            if(n%divided == 0)
            {
                System.out.println(divided);
                n/=divided;
            }
            else{
                divided++;
            }
        }
        
    }
}