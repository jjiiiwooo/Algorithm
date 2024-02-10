import java.util.Scanner;
import java.util.Arrays;

public class Main {
	//최대 공약수 
	public static int gcd(int a, int b)
	{
		if(b==0)
		{
			return a;
		}
		else
		{
			return gcd(b,a%b);
		}
	}
	
	
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        int arr[] = new int[num];
        int gap[] = new int[num-1];
        int gcd  = 0; //간격의 최대공약수 
        int result = 0;
        
        for(int i=0; i<num; i++)
        {
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr);
        
        //간격 저장
        for(int i=0; i<arr.length-1; i++)
        {
        	gap[i] = arr[i+1]-arr[i];
        }
    	
        //간격의 최대 공약수 구하기 
        gcd = gap[0];
        for(int i=1; i<arr.length-1; i++)
        {
        	gcd = gcd(gcd,gap[i]);
        }
        
        //추가로 심어야 할 가로수들 개수 
        for(int i=0; i<arr.length-1; i++)
        {
        	result+=(gap[i]/gcd)-1;
        }
        
        System.out.println(result);
        
    }
}