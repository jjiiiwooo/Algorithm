import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        int arr[] = new int[n];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++)
        {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int target = Integer.parseInt(br.readLine());
        
        Arrays.sort(arr); //오름차순 정렬
        
        int start = 0;
        int end = arr.length-1;
        int ans = 0;
        
        while(start<end)
        {
            int sum = arr[start]+arr[end];
            
            if(sum == target)
            {
                ans++;
                start++;
                end--;
            }
            else if(sum > target)
            {
                end--;
            }
            else
            {
                start++;
            }

        }
        
        bw.write(String.valueOf(ans));
        
        bw.flush();
        bw.close();
        
    }
        
}