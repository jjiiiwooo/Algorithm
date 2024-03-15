import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        //우선순위가 낮은 순 = 최소힙
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int N = Integer.parseInt(br.readLine());
        
        StringTokenizer st;
        for(int i=0; i<N; i++)
        {
            st = new StringTokenizer(br.readLine());
            int value = Integer.parseInt(st.nextToken());
            
            //값 제거 
            if(value == 0)
            {
                if(pq.isEmpty())
                {
                    sb.append("0").append("\n");
                }
                else
                {
                    int ans = pq.poll();
                    sb.append(ans).append("\n");
                }
            }
            //값 추가 
            else
            {
                pq.add(value);
            }
        }
        
        System.out.println(sb);
    }
}