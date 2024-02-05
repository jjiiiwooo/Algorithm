import java.util.Scanner;

//가장 작은 생성자 

public class Main {
    
    static int digitsum(int a)
    {
      int dsum = 0;
      while(a!=0)
      {
         dsum +=a%10;
         a/=10;
      }
      return dsum;
    }
    
    public static void main(String[] args)
    {   
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int sum =0;
        int s [] = new int[10000];
        int index=0;
        boolean check = false; //생성자 유무 체크 
        
        
        for(int i=0; i<n; i++)
        {
           sum = i+digitsum(i);
           if(sum==n)
           {
               s[index] = i;
               index++;
               check=true;
           }   
        }
        
        if(check)
        {
        	System.out.println(s[0]); //생성자 중 최솟값 출력
        }
        else 
        {
        	System.out.println(0);
        }

    }
}