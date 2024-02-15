import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Deque;
import java.util.ArrayDeque;

class Balloon {
	int idx; //풍선 번호
	int paper; //적혀 있는 값
	
	public Balloon(int idx, int paper)
	{
		this.idx = idx;
		this.paper = paper;
	}
}

public class Main {
	
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        Deque<Balloon> deque = new ArrayDeque<>();
         
        int n = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=1; i<=n; i++)
        {
        	int paper = Integer.parseInt(st.nextToken());
        	deque.add(new Balloon(i,paper)); //덱에 풍선 번호 저장 
        }
        
        
        while (!deque.isEmpty()) {
            bw.write(deque.getFirst().idx+" ");
            
            int cur = deque.pollFirst().paper;
            
            if(deque.isEmpty())
            	break;
            
            if(cur>0) {
            	for(int i=0; i<cur-1; i++)
            	{
            		deque.addLast(deque.pollFirst());
            	}
            }
            else
            {
            	for(int i=0; i<Math.abs(cur); i++)
            	{
            		deque.addFirst(deque.pollLast());
            	}
            }
        }

        
        bw.flush();
        bw.close();
    }
 }