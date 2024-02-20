import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static int[] arr;
    public static boolean[] visited;
    public static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        arr = new int[m];
        visited = new boolean[n+1]; 
        
        dfs(n,m,0);
        System.out.println(sb);
    }
    
    public static void dfs(int n, int m, int depth)
    {
        if(depth == m)
        {
            for(int i=0; i<m-1; i++)
            {
               //고른 수열이 오름차순이 아닐 경우 아무런 수행 없이 종료 
               if(arr[i]>arr[i+1])
                   return;
            }
            
            //오름차순일 경우 StringBuilder에 저장 
            for(int v :arr)
                sb.append(v+" ");
            sb.append("\n");
            return;
        }
        
        for(int i=1; i<=n; i++)
        {
            if(!visited[i])
            {
                visited[i] = true;
                arr[depth] = i;
                dfs(n,m,depth+1);
                visited[i] = false;
            }
        }
    }
}

