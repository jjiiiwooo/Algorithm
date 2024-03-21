import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main 
{
    static int memo[];
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        int A[] =new int[N];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++)
        {
            A[i] = Integer.parseInt(st.nextToken());
        }
        
        memo = new int[N];
        
        //memo 초기 값으로 첫 번째 수열의 값을 가짐
        memo[0] = A[0];
        int len = 1; //LIS의 길이 
        
        for(int i=1; i<N; i++)
        {
            int key = A[i];
            
            //만약 key가 memo의 마지막 값보다 클 경우 추가
            if(memo[len-1]<key)
            {
                len++;
                memo[len-1] = key;
            }
            else
            {
                //이분 탐색
                int low = 0;
                int high = len;
                while(low<high)
                {
                    int mid = (low+high)/2;
                    
                    if(memo[mid]<key)
                    {
                        low = mid+1;
                    }
                    else
                    {
                        high = mid;
                    }
                }
                //low가 memo에서 대치 될 원소의 위치가 될 것이고 
                //해당 위치에 key값으로 원소를 바꿔준다.
                memo[low] = key;
                
            }
        }
        
        bw.write(String.valueOf(len));
        
        bw.flush();
        bw.close();
        
     
    }
}