import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    static boolean[][] graph;
    static boolean[] visited;
    static int n,m;
    static int answer;
    
    public static void dfs(int idx)
    {
        visited[idx] = true;
        answer++; 
        
        for(int i=1; i<=n; i++)
        {
           if(visited[i]==false && graph[idx][i])
           {
               dfs(i);
           }
        }
    }
    
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());
        
        graph = new boolean[n+1][n+1];
        visited = new boolean[n+1];
        
        //1. graph에 연결 정보 채우기
        int x,y;
        for(int i=0; i<m; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            
            //x번 컴퓨터와 y번 컴퓨터가 서로 연결
            graph[x][y] = true;
            //y번 컴퓨터와 x번 컴퓨터가 서로 연결
            graph[y][x] = true;
        }
        
        //2.dfs(재귀 함수)호출
        dfs(1); //1번 컴퓨터부터 시작을 하겠다
        
        //3.출력
        bw.write(answer-1+""); //1번과 연결되어 있는 컴퓨터가 몇 대인지
        
        bw.flush();
        bw.close();
        br.close();
        
    }
}
