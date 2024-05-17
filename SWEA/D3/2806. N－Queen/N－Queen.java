import java.util.*;


class Solution
{	
	static boolean[] flag_a; //각 행에 배치했는지 체크
	static boolean[] flag_b; // / 대각선 방향에 퀸을 배치했는지 체크
	static boolean[] flag_c; // \ 대각선 방향에 퀸을 배치했는지 체크 
	static int[] pos; //각 열에 있는 퀸의 위치
	static int answer;
	static int N; //퀸 N개를 서로 공격할 수 없게 놓는 경우의 수 
	
	//i열에 알맞은 위치에 퀸을 배치
	 static void set(int i, int n)
	    {
	        for(int j=0; j<n; j++)
	        {
	            if(flag_a[j]==false && flag_b[i+j]==false &&flag_c[i-j+(n-1)]==false) // 수정된 부분: flag_a[j]로 변경
	            {
	                pos[i]=j;
	                if(i==n-1)
	                    answer++;
	                else
	                {
	                    flag_a[j] = flag_b[i+j] = flag_c[i-j+(n-1)] = true;
	                    set(i+1,n);
	                    flag_a[j] = flag_b[i+j] = flag_c[i-j+(n-1)] = false;
	                }
	            }
	        }
	    }
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for(int tc = 1; tc <= T; tc++)
		{
			N = sc.nextInt();
			
			flag_a = new boolean[N];
	        flag_b = new boolean[2*N-1];
	        flag_c = new boolean[2*N-1];
	        pos = new int[N];
	        answer = 0;
	        
	        set(0,N);
			
			System.out.printf("#%d %d\n",tc,answer);
			

		}
	}
}