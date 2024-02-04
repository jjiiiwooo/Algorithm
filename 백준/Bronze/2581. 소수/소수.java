import java.util.Scanner;

public class Main {
    
    //1이면 소수, 0이면 합성수 
    static int isPrime(int n)
    {
        if(n==1)
            return 0; //합성수
        for(int i=2; i<n; i++)
        {
            if(n%i==0)
                return 0; //합성수
        }
        return 1; //소수 
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int M = sc.nextInt();
        int N = sc.nextInt();
        int index=0;
        int prime[] = new int[10000];
        boolean flag = false;
        int sum = 0;
        int min = N;
        
        
        for(int i=M; i<=N; i++)
        {
        	if(isPrime(i)==1)
        	{
        		flag = true;
        		prime[index]=i;
        		index+=1;
        	}
        }
        
        for(int i=0; i<index; i++)
        {
            sum+=prime[i];
        }
        
        for(int i=0; i<index; i++)
        {
        	if(min>prime[i])
        		min = prime[i];
        }
        
        
        if(flag)
        {
        	System.out.println(sum);
        	System.out.println(min);
        }
        else
        {
        	System.out.println(-1);
        }
    }
}