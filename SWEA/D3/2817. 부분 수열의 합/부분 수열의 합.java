import java.util.*;

public class Solution {
	public static int dfs(int arr[], int N, int K, int idx, int curSum )
	{
		//모든 요소를 다 고려했을 때 
		if(idx==N)
		{
			return curSum==K?1:0;
		}
		
		//현재 요소를 포함하는 경우 
		int include = dfs(arr,N,K,idx+1, curSum+arr[idx]);
		//현재 요소를 포함하지 않는 경우 
		int exclude = dfs(arr,N,K,idx+1,curSum);
		
		return include+exclude;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int t=1; t<=T; t++) {
			int N = sc.nextInt(); //자연수 수 
			int K = sc.nextInt(); //합이 k가 되는 수 
			int answer=0; //합이 k가 되는 수 
			
			int arr[] = new int[N];
			
			for(int i=0; i<N; i++)
			{
				arr[i] = sc.nextInt();
			}
			
			answer = dfs(arr,N,K,0,0);
			
			System.out.printf("#%d %d\n", t, answer);
		}
	}
}
