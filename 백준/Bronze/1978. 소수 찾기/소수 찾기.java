import java.util.Scanner;

//2부터 n-1까지 어떤 정수로도 나누어 떨어지지 않으면 소수 
public class Main {
	
	//1이면 소수, 0이면 합성수
	static int isPrime(int n)
	{
        if(n==1)
            return 0;
		for(int i=2; i<n;i++)
		{
			if(n%i==0)
                return 0;
		}
		return 1;
			
	}
	
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        int arr[] = new int[num];
        int count=0;
        
        for(int i=0; i<num; i++)
        {
        	arr[i] = sc.nextInt();
        	
        }
        
        for(int i=0; i<arr.length; i++)
        {
        	if(isPrime(arr[i])==1)
        		count+=1;
        }
        
        System.out.println(count);
 
    }
}