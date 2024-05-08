import java.util.*;

class Solution {    
    
    public static void main(String args[]) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); 
        
        for (int t = 1; t <= T; t++)
        { 
        	int N = sc.nextInt();
        	int answer =0;
            int cur=0; //현재 속도 
            
            for(int i=0; i<N; i++)
            {
            	int C = sc.nextInt();
            	
            	//가속
            	if(C==1) {
            		int V = sc.nextInt();
            		cur +=V;
            		answer+=cur;
            	}
            	//현재 속도 유지 
            	else if(C==0)
            	{
            		answer+=cur;
            	}
            	//감속 
            	else if(C==2)
            	{
            		int V = sc.nextInt();
            		
            		//현재 속도보다 감속할 속도가 더 클 경우 
            		if(cur<V)
            		{
            			V=0;
            		}
            		else
            		{
            			cur-=V;
                		answer+=cur;
            		}
            	}
            	
            	
            }
            
            System.out.printf("#%d %d\n",t,answer);
            
            
        }
    }
}
