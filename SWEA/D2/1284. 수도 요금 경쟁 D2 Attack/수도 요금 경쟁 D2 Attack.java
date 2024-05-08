import java.util.*;

class Solution {    
    
    public static void main(String args[]) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        
        
        for (int t = 1; t <= T; t++)
        { 
        	int P = sc.nextInt(); //A사를 선택했을 때 1리터당 요금
        	int Q = sc.nextInt(); //B사를 선택했을 때 기본 요금 
        	int R = sc.nextInt(); //B사 기준선 
        	int S = sc.nextInt(); //B사 기준선 넘었을 때 초과분 
        	int W = sc.nextInt(); //종민이 요금 
        	
        	
        	//A사를 선택했을 때 요금 
        	int A = W*P;
        	
        	//B사를 선택했을 때 요금 
        	int B = 0;
        	//기준선 아래로 사용했을 때 
        	if(W<R)
        	{
        		B = Q; //기본 요금 
        	}
        	else
        	{
        		//기준선까지는 기본요금 + 기준선 이후부터 초과분 
        		B = Q+(S*(W-R));
        	}
        	
        	int answer = Math.min(A, B);
        	
        	System.out.printf("#%d %d\n",t,answer);
        }
    }
}