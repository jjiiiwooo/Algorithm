import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    static int cnt_w = 0;
    static int cnt_b = 0;
    static int board[][];
    
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        board = new int[n][n];
       
        for(int i=0; i<n; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++)
            {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        partition(0,0,n);
        bw.write(cnt_w+"");
        bw.newLine();
        bw.write(cnt_b+"");
        
        bw.flush();
        bw.close();
    }
    
    //색종이의 색이 다를 경우 변의 길이를 자름
    static void partition(int row, int col, int size)
    {
        //색이 같을 경우는 각 카운트 증가
        if(check(row,col,size))
        {
            if(board[row][col]==0)
            {
                cnt_w++;
            }
            else
            {
                cnt_b++;
            }
            return;
        }
        
        //색이 다를 경우 
        int newSize = size/2; //절반
        
        //재귀 호출
        partition(row,col,newSize); //2사분면
        partition(row,col+newSize,newSize); //1사분면
        partition(row+newSize,col,newSize); //3사분면
        partition(row+newSize,col+newSize, newSize); //4사분면
    }
    
    //색종이의 색이 같은지 다른지 확인
    static boolean check(int row, int col, int size)
    {
        int color = board[row][col]; //첫 번째 원소를 기준으로 검사 
        
        for(int i=row; i<row+size; i++)
        {
           for(int j=col; j<col+size; j++)
           {
               //색상이 같지 않다면 false를 리턴
               if(board[i][j] != color)
               {
                   return false;
               }
           }
        }
        //검사가 모두 통과했다는 의미이므로 true 리턴
        return true;
    }
}