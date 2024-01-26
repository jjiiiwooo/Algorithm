import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        for(int i=1; i<=num; i++) //세로
        {
            for(int j=1; j<=i; j++) //가로
                System.out.print('*');
            System.out.println();
        }
        
        sc.close();
    }
}