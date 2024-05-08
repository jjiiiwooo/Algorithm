import java.util.*;

class Solution {    
    
    public static void main(String args[]) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();           
        for (int t = 1; t <= T; t++)
        { 
        	sc.nextInt();
        	int score[] = new int[101];
        	for(int i=0; i<1000; i++)
        	{
        		score[sc.nextInt()]++;
        	}
        	
        	int mode = 0; //최빈값
        	int answer = 0; //최빈값인 점수 
        	
        	for(int i=100; i>0; i--)
        	{
        		if(score[i]>mode) {
        			mode = score[i]; //빈도수 저장
        			answer= i; //최빈값
        		}
        	}
        	
        	System.out.printf("#%d %d\n",t,answer);
        	
        }
    }
}