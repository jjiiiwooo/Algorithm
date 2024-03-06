import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    static int board[][];
    static int cnt1 = 0; //-1 개수
    static int cnt2 = 0; //0 개수
    static int cnt3 = 0; // 1 개수 
    
    public static void main(String[] args)throws IOException
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
        
        bw.write(cnt1+"");
        bw.newLine();
        
        bw.write(cnt2+"");
        bw.newLine();
        
        bw.write(cnt3+"");
        bw.newLine();
        
        bw.flush();
        bw.close();
        
    }
    
    public static void partition(int row, int col, int size)
    {
        if(check(row,col,size))
        {
            if(board[row][col]==-1)
            {
                cnt1++;
            }
            else if(board[row][col]==0)
            {
                cnt2++;
            }
            else
            {
                cnt3++;
            }
            return;
        }
        
        //숫자가 다를 경우 
        int newSize = size/3;
        
        //재귀 호출
        partition(row,col,newSize);
        partition(row,col+newSize, newSize);
        partition(row,col+2*newSize, newSize);
        
        partition(row+newSize,col,newSize);
        partition(row+newSize,col+newSize,newSize);
        partition(row+newSize,col+2*newSize,newSize);
        
        partition(row+2*newSize, col, newSize);
        partition(row+2*newSize, col+newSize, newSize);
        partition(row+2*newSize, col+2*newSize, newSize);
        
    }
    
    //현재 나뉜 숫자가 같은지 체크 
    static boolean check(int row, int col, int size)
    {
        int num = board[row][col]; 
        
        for(int i=row; i<row+size; i++)
        {
            for(int j=col; j<col+size; j++)
            {
                if(num != board[i][j])
                {
                    return false;
                }
            }
        }
        return true;
    }
}
