import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int K = sc.nextInt();
        int divisor [] = new int[N];
        int index =0;
        int count =0; //약수의 개수
       
        for(int i=1; i<=N; i++)
        {
            if(N%i==0)
            {
                divisor[index] = i;
                index++;
                count++;
            }
        }
    
        if(count>=K)
        {
            System.out.println(divisor[K-1]);
        }
        else
        {
            System.out.println(0);
        }

    }
}
