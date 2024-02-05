import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int n  = sc.nextInt(); //카드의 개수 
        int m = sc.nextInt(); //합 
        int sum = 0;
        int answer = 0;
        int num[] = new int[100];
        
        for(int i=0; i<n; i++)
        {
            num[i] = sc.nextInt();
        }
        
        for(int i=0; i<n; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    sum = num[i]+num[j]+num[k];
                    if(sum>answer && sum <=m)
                        answer=sum;
                }
            }
        }
        
        System.out.println(answer);
    }
}
