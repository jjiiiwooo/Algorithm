import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    static boolean[] flag_a; //각 행에 배치했는지 체크
    static boolean[] flag_b; // /대각선 방향으로 퀸을 배치했는지 체크 
    static boolean[] flag_c; // \대각선 방향으로 퀸을 배치했는지 체크 
    static int[] pos; //각 열에 있는 퀸의 위치 
    static int answer;
    static int n;
    
    //i열에 알맞은 위치에 퀸을 배치 
    static void set(int i, int n)
    {
        
       for(int j=0; j<n; j++)
       {
           if(flag_a[j] == false &&
             flag_b[i+j]==false &&
             flag_c[i-j+(n-1)]==false) {
               pos[i]=j; //퀸을 j행에 배치 
               if(i==n-1)
                   answer++;
               else
               {
                   flag_a[j] = flag_b[i+j] = flag_c[i-j+(n-1)] = true;
                   set(i+1,n);
                   flag_a[j] = flag_b[i+j] = flag_c[i-j+(n-1)] = false;
               }
           }
       }
    }
    
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        flag_a = new boolean[n];
        flag_b = new boolean[2*n-1];
        flag_c = new boolean[2*n-1];
        pos = new int[n];
        
        set(0,n);
        
        bw.write(answer+"");
        
        bw.flush();
        bw.close();
        br.close();
    }
}