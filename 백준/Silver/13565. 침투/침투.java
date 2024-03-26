import java.util.*;
import java.io.*;

public class Main
{
    final static int MAX = 1000 +10;
    static boolean map[][];
    static boolean visited[][];
    //dfs를 상하좌우로 돌기 위해서 그 상하좌우의 좌표값을 담아 줌 
    static int dirY[] = {-1,1,0,0};
    static int dirX[] = {0,0,-1,1};
    static int T,N,M,K;
    static boolean answer;
    
    //dfs
    static void dfs(int y, int x) //x,y : 현재 내가 방문하고 있는 지점
    {
        if(y==N)
        {
            answer = true;
            return;
        }
        visited[y][x] = true;
        //왜 4개? -> 상하좌우 확인
        for(int i=0; i<4; i++)
        {
            int newY = y + dirY[i];
            int newX = x + dirX[i];
            
            if(map[newY][newX] && visited[newY][newX] == false)
                dfs(newY,newX);
        }
    }
    
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        
        map = new boolean[MAX][MAX];
        visited = new boolean[MAX][MAX];
        
        //1.map 정보 반영 
        for(int i=1; i<=N; i++)
        {
            String str = br.readLine();
            for(int j=1; j<=M; j++)
                map[i][j] = (str.charAt(j-1)=='0')?true:false;
        }
        
        //2. dfs 수행 
        for(int j=1; j<=M; j++)
        {
            if(map[j][1])
                dfs(1,j); 
        }
        
        //3. 출력
        
        if(answer)
        {
            bw.write("YES");
        }
        else
        {
            bw.write("NO");
        }
        
        bw.flush();
        bw.close();
        br.close();
    } 
}
