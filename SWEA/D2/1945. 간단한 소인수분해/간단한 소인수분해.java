import java.util.*;

class Solution {    
    
    public static void main(String args[]) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); 
        
        for (int t = 1; t <= T; t++)
        { 
            int N = sc.nextInt();
            
            int decimal[] = {2,3,5,7,11};
            int answer[] = new int[5];
           
            for(int i=0; i<5; i++)
            {
            	while(true)
            	{
            		if(N%decimal[i]==0)
            		{
            			answer[i]++;
            			N=N/decimal[i];
            		}
            		else
            		{
            			break;
            		}
            	}
            }
            
            System.out.printf("#%d ",t);
            for(int i=0; i<answer.length; i++)
            {
            	System.out.print(answer[i]+" ");
            }
            System.out.println();
            
        }
    }
}
