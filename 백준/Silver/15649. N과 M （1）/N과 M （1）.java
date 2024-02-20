import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int[] arr;
    public static boolean[] visit;
    
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        arr = new int[m];
        visit = new boolean[n];
        dfs(n,m,0);
    }
    
    public static void dfs(int n, int m , int depth)
    {
    	//재귀 깊이가 m과 같아지면 탐색과정에서 담았던 배열을 출력
        if(depth == m)
        {
            for(int v : arr)
            {
                System.out.print(v+" ");
            }
            System.out.println();
            return;
        }
        
        for(int i=0; i<n;i++)
        {
        	//만약 해당 노드(값)을 방문하지 않았다면?
            if(!visit[i])
            {
                visit[i] = true;
                arr[depth] = i+1;
                dfs(n,m,depth+1); //다른 자식 노드 방문을 위해 depth+1 증가시키면서 재귀 호출
               
                //자식 노드 방문이 끝나고 돌아오면 방문 노드를 방문하지 않은 상태로 변경
                visit[i] = false;
            }
        }
    }
    
    
}