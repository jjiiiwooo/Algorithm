import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Queue;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main
{
    static int N,M;
    static int map[][];
    static boolean visited[][];
    static Queue<Coordinate> q = new LinkedList<>();
    
    //bfs
    static void bfs(int x, int y)
    {
       int[] dirX = {-1,1,0,0};
       int[] dirY = {0,0,-1,1};
       
       q.offer(new Coordinate(x,y)); 
       visited[x][y] = true;
       
       while(!q.isEmpty()) {
    	   Coordinate cur = q.poll(); //큐에서 객체 꺼내기
    	   
    	   //상하좌우 확인 
    	   for(int i=0; i<4; i++)
    	   {
    		   int new_X = cur.x + dirX[i];
    		   int new_Y = cur.y + dirY[i];
    		   
    		   //새로운 좌표가 N*M 범위를 넘는 노드 제외 
    		   if(new_X<0 || new_X>=N || new_Y<0 || new_Y>=M)
    			   continue;
    		   
    		   //값이 0이고, 이미 방문한 노드 제외 
    		   if(map[new_X][new_Y]==0 || visited[new_X][new_Y])
    			   continue;
    		   
    		   //새로운 좌표에 지나온 노드 수 저장 
    		   map[new_X][new_Y] = map[cur.x][cur.y]+1;
    		   //새로운 좌표의 객체 생성, 큐에 삽입 
    		   q.offer(new Coordinate(new_X,new_Y));
    		   visited[new_X][new_Y] = true;
    	   }
       }
    }
    
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        
        map = new int[N][M];
        visited = new boolean[N][M];
        
        //map 정보 반영
        for(int i=0; i<N; i++)
        {
            String str = br.readLine();
            for(int j=0; j<M; j++)
            {
                map[i][j] = str.charAt(j)-'0';
            }
        }
        
        bfs(0,0);
        bw.write(String.valueOf(map[N-1][M-1])); //마지막 지점의 값 출력 

       
        bw.flush();
        bw.close();
    }
}

class Coordinate{
	int x;
	int y;
	
	Coordinate(int x, int y)
	{
		this.x = x;
		this.y =y;
	}
}