import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Queue;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    static int N,K;
    static boolean visited[];
    
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        
        if(N==K)
        {
            System.out.println(0);
            return;
        }
        
        visited = new boolean[100001];
        
        Queue<Integer> q = new LinkedList<>();
        q.add(N); //수빈이 위치 삽입
        int size = q.size();
        int count = 0;
        
        while(true) {
            count++;
            size = q.size();
            
            for(int i=0; i<size; i++) {
                int x = q.remove();
                visited[x] = true;
                
                if(x-1 == K || x+1 == K || x*2 == K) {
                   System.out.println(count); 
                   return;
                }
                if(x-1 >=0 && !visited[x-1]) {
                    visited[x-1] = true;
                    q.add(x-1);
                }
                if(x+1<=100000 && !visited[x+1]) {
                    visited[x+1] = true;
                    q.add(x+1);
                }
                if(x*2 <=100000 && !visited[x*2]){
                    visited[x*2] = true;
                    q.add(x*2);
                }
            }
        }
    }
}