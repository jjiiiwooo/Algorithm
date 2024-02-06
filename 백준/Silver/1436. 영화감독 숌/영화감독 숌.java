import java.util.Scanner;

//종말의 수 = 어떤 수에 6이 적어도 3개 이상 연속으로 들어가는 수 
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int count = 0;
        
        int first = 666;
        
        String s = first+"";
        
        while(true)
        {
        	if(String.valueOf(first).contains("666"))
        	{
        		count+=1;
        	}
        	
        	if(count==n)
        	{
        		System.out.println(first);
        		break;
        	}
        	
        	first++;
        }
    }
}