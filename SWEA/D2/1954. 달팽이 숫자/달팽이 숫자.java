import java.util.*;

class Solution {
    public static void main(String args[]) throws Exception {
    	//우->하->좌->상 방향 배열 
        int dirx[] = {0,1,0,-1};
        int diry[] = {1,0,-1,0};
        
        
    	Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); 
        
        for (int t = 1; t <= T; t++) { 
            int N = sc.nextInt();
            
            int snail[][] = new int[N][N];
            boolean visit[][] = new boolean[N][N];
            
            for(int i=0; i<N; i++)
            {
            	Arrays.fill(visit[i], false);
            }
            
            //현재 방향 인덱스 
            int dir = 0;
            
            //시작 좌표 
            int x = 0;
            int y = 0;
            
            for(int i=1; i<=N*N; i++)
            {
            	snail[x][y] = i;
            	visit[x][y] = true; //방문 표시 
            	
            	//다음 칸 갈 수 있는지 확인 
            	int nextx = x+dirx[dir];
            	int nexty = y+diry[dir];
            	
            	//방향 전환
            	//1. 범위를 넘어갈 때
            	//2. 다음칸이 채워져 있을 때 
            	if(nextx>=N || nexty>=N || nextx<0 || nexty<0 || visit[nextx][nexty]==true)
            	{
            		dir = (dir+1)%4; //방향 전환 
            	}
            	
            	//다음칸 지정
            	x = x+dirx[dir];
            	y = y+diry[dir];
            }
            
            System.out.printf("#%d\n",t);
            for(int i=0; i<N; i++)
            {
            	for(int j=0; j<N; j++)
            	{
            		System.out.print(snail[i][j]+" ");
            	}
            	System.out.println();
            }         
        }
    }
}