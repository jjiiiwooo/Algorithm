import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main 
{
    public static char[][] arr;
    
    static void makeStar(int x, int y, int n, boolean blank)
    {
        //공백 칸일 경우 
        if(blank)
        {
            for(int i=x; i<x+n; i++)
            {
                for(int j=y; j<y+n; j++)
                {
                    arr[i][j] = ' ';
                }
            }
            return;
        }
        
        //더 이상 쪼갤 수 없는 블록일 때 
        if(n==1)
        {
            arr[x][y] = '*';
            return;
        }
        
        int size = n/3;
        int count = 0; //별 출력 누적 
        
        for(int i=x; i<x+n; i+=size)
        {
            for(int j=y; j<y+n; j+=size)
            {
                count++;
                if(count == 5)
                {
                    //공백 칸일 경우 
                    makeStar(i,j,size,true);
                }
                else
                {
                    makeStar(i,j,size,false);
                }
            }
        }
    }
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        arr = new char[n][n];
        
        makeStar(0,0,n,false);
        
        for(int i=0; i<n;i++)
        {
            bw.write(arr[i]);
            bw.write("\n");
        }
        
        bw.flush();
        bw.close();
        
        
    }
}