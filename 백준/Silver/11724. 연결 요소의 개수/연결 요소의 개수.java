import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    final static int MAX = 1000 + 10;
    static boolean graph[][];
    static boolean visited[];
    static int n,m;
    static int answer;
    
    static void dfs(int idx)
    {
        visited[idx] = true;
        for(int i=1; i<=n; i++)
        {
            if(visited[i] == false && graph[idx][i])
            {
                dfs(i);
            }
        }
    }
    
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        
        //1. graph에 연결 정보 채우기 
        graph = new boolean[MAX][MAX];
        visited = new boolean[MAX];
        
        //m개의 간선 정보 반영
        for(int i=0; i<m; i++)
        {
            st= new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph[u][v] = true;
            graph[v][u] = true; 
        }
        
        //2. dfs(재귀 함수) 호출
        for(int i=1; i<=n; i++)
        {
            if(visited[i] == false)
            {
                dfs(i);
                answer++;
            }
        }
        
        //3.출력
        bw.write(answer+"");
        
        bw.flush();
        bw.close();
        br.close();
    }
}