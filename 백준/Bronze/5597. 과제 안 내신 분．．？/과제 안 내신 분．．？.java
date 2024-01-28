import java.util.Scanner;

public class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int check[] = new int[31];

        for(int i=0; i<28; i++)
        {
            int input = sc.nextInt();
            check[input] =1;
        }
        
        for(int j=1; j<check.length; j++)
        {
            if(check[j] !=1)
            {
                System.out.println(j);
            }
        }
        
        sc.close();
        
    }
}
