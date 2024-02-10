import java.util.Scanner;

public class Main {
    
    public static void Eratosthenes(int arr[], int n)
    {
        //배열 초기화 
        //2부터 n까지의 정수를 배열에 저장 
        for(int i=2; i<=n; i++)
        {
            arr[i] = i;
        }
        
        //에라토스테네스의 채 알고리즘
        //2부터 시작하여 2의 배수를 모두 지움, 3부터 시작하여 3의 배수를 모두 지움
        //... 위 과정 반복
        for(int i=2; i*i<=n; i++)
        {
            //배열의 값이 0인 경우는 이미 지워진 수 -> 무시하고 다음 인덱스로 
            if(arr[i] ==0) continue;
            for(int j=i*2; j<=n; j+=i)
            {
                arr[j] = 0;
            }
        }
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int m = sc.nextInt();
        int n = sc.nextInt();
        
        if(m<2)
        {
        	m=2;
        }
        
        int arr[] = new int[n+1];
        Eratosthenes(arr,n);
        for(int i=m; i<=n; i++)
        {
            if(arr[i]!=0)
            {
                System.out.println(arr[i]);
            }
        }

    }
}