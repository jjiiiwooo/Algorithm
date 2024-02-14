import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        Deque<Integer> deque = new LinkedList<>();
        
        int n = Integer.parseInt(br.readLine());
        
        for(int i=0; i<n; i++)
        {
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);
            
            switch(st.nextToken())
            {
                case "1":
                    //앞쪽에 데이터 삽입
                    deque.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                    
                case "2" :
                    //뒤쪽에 데이터 삽입
                    deque.addLast(Integer.parseInt(st.nextToken()));
                    break;
                    
                case "3":
                    //맨 앞 정수 제거하고 출력
                    //비어 있다면 -1 출력
                    if(deque.isEmpty())
                    {
                        bw.write(-1+"");
                        bw.newLine();
                    }
                    else
                    {
                        bw.write(deque.removeFirst()+"");
                        bw.newLine();
                    }
                    break;
                    
                case "4":
                    //맨 뒤 정수 제거하고 출력
                    //비어 있다면 -1 출력
                    if(deque.isEmpty())
                    {
                        bw.write(-1+"");
                        bw.newLine();
                    }
                    else
                    {
                        bw.write(deque.removeLast()+"");
                        bw.newLine();
                    }
                    break;
                    
                case "5":
                    //덱에 들어 있는 정수의 개수 출력
                    bw.write(deque.size()+"");
                    bw.newLine();
                    break;
                    
                case "6":
                    //덱이 비어 있으면 1, 아니면 0 출력
                    if(deque.isEmpty())
                    {
                        bw.write(1+"");
                        bw.newLine();
                    }
                    else
                    {
                        bw.write(0+"");
                        bw.newLine();
                    }
                    break;
                    
                case "7":
                    //맨 앞의 정수 출력
                    //비어 있다면 -1 출력
                    if(deque.isEmpty())
                    {
                        bw.write(-1+"");
                        bw.newLine();
                    }
                    else
                    {
                        bw.write(deque.getFirst()+"");
                        bw.newLine();
                    }
                    break;
                    
                case "8":
                    //맨 뒤의 정수 출력
                    //비어 있다면 -1 출력
                    if(deque.isEmpty())
                    {
                        bw.write(-1+"");
                        bw.newLine();
                    }
                    else
                    {
                        bw.write(deque.getLast()+"");
                        bw.newLine();
                    }
                    
                    break;

            }
            
        }
        
        bw.flush();
        bw.close();
    }
}