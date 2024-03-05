import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Collections;

public class Main 
{
    final static int MAX = 1000000+10;
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int N,M,R;
    static int[] answer;
    static int order;
    
    public static void dfs(int idx)
    {
        visited[idx]= true;
        answer[idx] = order;
        order++;
        
        for(int i=0; i<graph[idx].size(); i++)
        {
            //인덱스랑 연결되어 있는 i번째 노드를 next 변수에 담아줌
            int next = graph[idx].get(i);
            
            if(visited[next] == false)
            {
                dfs(next);
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
        R = Integer.parseInt(st.nextToken());
        
        //1. graph에 연결 정보 채우기 
        graph = new ArrayList[MAX];
        for(int i=1; i<=N; i++)
        {
            graph[i] = new ArrayList<>();
        }
        visited = new boolean[MAX];
        answer = new int[MAX];
        order = 1;
        
        //간선 정보 채우기 
        for(int i=0; i<M; i++)
        {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
           
            graph[x].add(y);
            graph[y].add(x);
        }
        
        //2. 내림차순 정렬
        for(int i=1; i<=N; i++)
        {
            Collections.sort(graph[i], Collections.reverseOrder());
        }
        
        //3.dfs(재귀 함수 호출)
        dfs(R);
        
        //4.출력
        for(int i=1; i<=N; i++)
        {
            bw.write(String.valueOf(answer[i]));
            bw.newLine();
        }
        
        bw.flush();
        bw.close();
        
    }
}