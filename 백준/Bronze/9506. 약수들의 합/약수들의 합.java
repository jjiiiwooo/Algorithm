import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        while(true)
        {
            int n = sc.nextInt();
            
            int index = 0;
            int sum = 0;
            int count = 0;
            
            int divisior[] = new int[100];
            
            if(n== -1)
            {
            	break;
            }
            
            for(int i=1; i<n; i++)
            {
            	if(n%i==0)
            	{
            		divisior[index]=i;
                    index+=1;
                    count+=1;
            		sum+=i;
            	}
            }
            
            if(n==sum)
            {
            	//완전수 
            	System.out.print(n+" = ");
            	for(int i=0; i<count; i++)
            	{
            		if(i == count-1)
            		{
            			System.out.print(divisior[i]);
            		}
            		else
            		{
            			System.out.print(divisior[i]+" + ");
            		}
                   
            	}
            	 System.out.println();
            }
            else
            {
            	System.out.println(n +" is NOT perfect.");
            }

        }
    }
}