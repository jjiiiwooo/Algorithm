import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        int prefixSum[][] = new int[n+1][n+1];
        for(int i=1; i<=n; i++)
        {
            st= new StringTokenizer(br.readLine());
            for(int j=1; j<=n; j++)
            {
                prefixSum[i][j] = prefixSum[i][j-1] + prefixSum[i-1][j]-prefixSum[i-1][j-1]+ Integer.parseInt(st.nextToken());
            }
        }
        
        for(int i=0; i<m; i++)
        {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            sb.append(prefixSum[x2][y2] - prefixSum[x2][y1-1] - prefixSum[x1-1][y2]+prefixSum[x1-1][y1-1]).append("\n");
        }
        
        System.out.println(sb);
    }
}