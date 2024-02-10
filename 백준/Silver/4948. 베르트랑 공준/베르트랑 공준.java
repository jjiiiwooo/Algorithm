import java.util.Scanner;

public class Main {
    
    public static void Eratosthenes(int arr[], int n)
    {
        
        for(int i=2; i<=n; i++)
        {
            arr[i] = i;
        }
        
        for(int i=2; i*i<=n; i++)
        {
            
            if(arr[i] ==0) continue;
            for(int j=i*2; j<=n; j+=i)
            {
                arr[j] = 0;
            }
        }
    }
    
    //소수 판별
    public static boolean isPrime(int n)
    {
    	if(n<2)
    		return false;
    	
    	for(int i=2; i<=Math.sqrt(n); i++)
    	{
    		if(n%i==0) return false; //나누어 떨어지면 소수 아님
    	}
    	return true;
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        
        while(true)
        {
            int n = sc.nextInt();
            
            if(n==0)
                break;
            
            int arr[] = new int[n*2+1];
            int count=0; //소수 개수 
            Eratosthenes(arr,n*2);
            
            for(int i=n; i<=n*2; i++)
            {
                if(arr[i]!=0)
                {
                	
                    count++;
                }
            }
            
            if(isPrime(n)) //n이 소수라면 -1
            {
            	System.out.println(count-1);
            }
            else
            {
            	System.out.println(count);
            }
          
        }
    }
}