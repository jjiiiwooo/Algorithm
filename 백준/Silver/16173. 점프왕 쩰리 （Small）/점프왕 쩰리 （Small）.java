import java.util.*;
import java.io.*;

public class Main
{
    final static int MAX = 3+110;
    static int map[][];
    static boolean visited[][];
    static int dirY[] = {1,0};
    static int dirX[] = {0,1};
    static int N;
    
    //dfs
    public static void dfs(int y, int x)
    {
    	visited[y][x] = true;
    	
    	if(y==N && x==N)
    		return;
    	
    	for(int i=0; i<2; i++)
    	{
    		int newY = y + dirY[i] * map[y][x];
    		int newX = x + dirX[i] * map[y][x];
    		if(visited[newY][newX] == false)
    			dfs(newY, newX);
    	}
    }
    
    
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        N = Integer.parseInt(br.readLine());
        map = new int[MAX][MAX];
        visited = new boolean[MAX][MAX];
        
        //1.map 정보 반영 
        for(int i=1; i<=N; i++)
        {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	for(int j=1; j<=N; j++)
        	{
        		map[i][j] = Integer.parseInt(st.nextToken());
        	}
        }
        
        //2.dfs 수행
        dfs(1,1);
        
        //3. 출력
        if(visited[N][N]) 
        	bw.write("HaruHaru");
        else
        	bw.write("Hing");
        
        bw.flush();
        bw.close();
        br.close();
       
    }
    
}