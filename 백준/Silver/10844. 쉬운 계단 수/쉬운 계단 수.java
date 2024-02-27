import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    static Long memo[][];
    static int n;
    final static long MOD = 1000000000;
    
    //digit는 자릿수, val은 자릿값을 의미
    static long df(int digit, int val)
    {
        //첫째 자릿수에 도착한다면 더이상 탐색할 필요 없음
        if(digit == 1)
        {
            return memo[digit][val];
        }
        
        //해당 자릿수의 val값에 대해 탐색하지 않았을 경우 
        if(memo[digit][val]==null)
        {
            //val이 0일 경우 이전 자리는 1밖에 오지 못함
            if(val==0)
            {
                memo[digit][val] = df(digit-1,1);
            }
            //val이 1일 경우 이전은 8밖에 오지 못함
            else if(val==9)
            {
                memo[digit][val] = df(digit-1,8);
            }
            //그 외의 경우에는 val-1과 val+1의 값의 경우의 수를 합한 수가 됨
            else
            {
                memo[digit][val] = df(digit-1,val-1)+df(digit-1,val+1);
            }
        }
        return memo[digit][val]%MOD;
    }
    
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        n = Integer.parseInt(br.readLine());
        
        memo = new Long[n+1][10];
        
        //첫 번째 자릿수 1로 초기화
        for(int i=0; i<10; i++)
        {
            memo[1][i] = 1L;
        }
        
        long result = 0;
        
        //마지막 자릿수인 1~9까지의 경우의 수를 모두 더함 
        for(int i=1; i<=9; i++)
        {
            result += df(n,i);
        }
        
        bw.write(String.valueOf(result%MOD));
        bw.flush();
        bw.close();
    }
}