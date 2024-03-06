import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    static int board[][];
    static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args)throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        board = new int[n][n];
        
        for(int i=0; i<n; i++)
        {
        	char input[] = br.readLine().toCharArray();
        	for(int j=0; j<n; j++)
        	{
        		board[i][j] = input[j]-'0';
        	}
        }
        
        partition(0,0,n);
        bw.write(sb+"");
        
        bw.flush();
        bw.close();
    }
    
    static void partition(int row, int col, int size)
    {
    	//압축이 가능할 경우 하나의 색상으로 압축
        if(check(row,col,size))
        {
            sb.append(board[row][col]);
            return;
        }
        
        //압축이 불가능 할 경우 사이즈를 절반으로 나누어야 함
        int newSize = size/2; 
        
        sb.append('('); //각 레벨에서 여는 괄호로 시작
        
        partition(row,col,newSize); //왼쪽 위 
        partition(row, col+newSize,newSize); //오른쪽 위
        partition(row+newSize,col,newSize); //왼쪽 아래 
        partition(row+newSize, col+newSize, newSize); //오른쪽 아래 
    
        sb.append(')'); //해당 레벨이 끝나면 닫는 괄호로 닫아줌 
    }
    
    
    //현재 나뉜 색상이 같은지 체크 
    public static boolean check(int row, int col, int size)
    {
        int color = board[row][col]; //첫 번째 원소를 기준으로 검사
        
        for(int i=row; i<row+size; i++)
        {
            for(int j=col; j<col+size; j++)
            {
                if(color != board[i][j])
                {
                    return false;
                }
            }
        }
        
        return true;
    }
}