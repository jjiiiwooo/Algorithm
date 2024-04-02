import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    static boolean visited[];
    static int N,M,R;
    
    //bfs
    public static void bfs(int r, LinkedList<Integer>[] list, boolean visited[])
    {
    	int order[] = new int[N+1]; //긱 정점의 방문 순서 기록
    	Queue<Integer>q = new LinkedList<Integer>();
    	visited[r] = true;
    	q.add(r); //시작 정점 큐에 추가 
    	int count=1; //방문 순서를 기록
    	
    	while(q.size()!=0)
    	{
    		r = q.poll();
    		order[r] = count++; //정점 r의 방문 순서를 기록
    		
    		Iterator<Integer> iter = list[r].listIterator();
    		
    		while(iter.hasNext()) {
    			int w = iter.next();
    			if(!visited[w]) {
    				visited[w] = true;
    				q.add(w);
    			}
    		}
    	}
    	//각 정점의 방문 순서를 출력
    	for(int i=1; i<=N; i++)
    	{
    		System.out.println(order[i]);
    	}
    	
    	
    }
    
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); //정점의 수 
        M = Integer.parseInt(st.nextToken()); //간선의 수 
        R = Integer.parseInt(st.nextToken()); //시작 정점
        
        LinkedList<Integer>[] list = new LinkedList[N+1];
        visited = new boolean[N+1]; //방문여부 검사 
        
        
        for(int i=0; i<=N; i++)
        {
        	list[i] = new LinkedList<Integer>();
        }
        
        for(int i=0; i<M; i++)
        {
        	st = new StringTokenizer(br.readLine());
        	int x = Integer.parseInt(st.nextToken());
        	int y = Integer.parseInt(st.nextToken());
        	list[x].add(y);
        	list[y].add(x);
        }
        
        for(int i=1; i<=N; i++)
        {
        	Collections.sort(list[i]); //방문 순서를 위해 오름차순 정렬
        }
        
        bfs(R,list,visited);

    }
}