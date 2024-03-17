import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        int arr[] = new int[n];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++)
        {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arr);
        
        int start = 0;
        int end = arr.length-1;
        int min = Integer.MAX_VALUE; //현재까지 0에 가장 가까웠던 합 
        int ans[] = new int[2];
        
        while(start<end)
        {
            int sum = arr[start]+arr[end];
            
            if(min>Math.abs(sum))
            {
                min = Math.abs(sum);
                ans[0] = arr[start];
                ans[1] = arr[end];
                
                if(sum == 0)
                    break;
            }
            
            if(sum<0)
            {
                start++; //수가 더 커져야 하므로 start 증가
            }
            else
            {
                end--; //수가 더 작아져야 하므로 end 감소 
            }
            
        }
        System.out.println(ans[0]+" "+ans[1]);
    }
}