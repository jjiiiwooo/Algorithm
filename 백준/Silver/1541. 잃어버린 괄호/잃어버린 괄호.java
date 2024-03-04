import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int sum = Integer.MAX_VALUE;
        StringTokenizer subtraction = new StringTokenizer(br.readLine(),"-");
        
        while(subtraction.hasMoreTokens())
        {
            int temp = 0;
            
            //뺄셈으로 나뉜 토큰을 덧셈으로 분리하여 해당 토큰을 더한다.
            StringTokenizer addition = new StringTokenizer(subtraction.nextToken(),"+");
            
            //덧셈으로 나뉜 토큰들을 모두 더한다.
            while(addition.hasMoreTokens())
            {
                temp+=Integer.parseInt(addition.nextToken());
            }
            
            //첫 번째 토큰인 경우 temp값이 첫 번째 수가 됨
            if(sum == Integer.MAX_VALUE)
            {
                sum = temp;
            }
            else
            {
                sum-=temp;
            }
        }
        
        bw.write(sum+"");
        bw.flush();
        bw.close();
    }
}