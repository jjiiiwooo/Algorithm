import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); //수열의 길이
        int S = Integer.parseInt(st.nextToken()); //합
        
        int arr[] = new int[N+1];
        
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++)
        {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int start = 0;
        int end = 0;
        int sum = arr[0];
        int len = N+1;
        
        while(start<=end&& end<N)
        {
            if(sum <S)
            {
                sum += arr[++end];
            }
            else
            {
                len = Math.min(len, end-start + 1);
                sum -= arr[start++];
            }
        }
        
        if(len == N+1) 
            len = 0;
        
        bw.write(String.valueOf(len));
        
        bw.flush();
        bw.close();
    }
}