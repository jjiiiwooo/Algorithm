import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int subsum[][];
    
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        char ch[] = br.readLine().toCharArray();
        n = Integer.parseInt(br.readLine());
        subsum = new int[ch.length+1][26];
        
        for(int i=1; i<=ch.length; i++)
        {
           int idx = ch[i-1]-'a';
            for(int j=0; j<26; j++)
            {
                if(idx==j)
                {
                    subsum[i][j] = subsum[i-1][j]+1;
                }
                else
                {
                    subsum[i][j] = subsum[i-1][j];
                }
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++)
        {
            st = new StringTokenizer(br.readLine());
            int find = st.nextToken().charAt(0)-'a';
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken())+1;
            
            sb.append(subsum[r][find]-subsum[l][find]).append("\n");
        }
        
        System.out.println(sb);
    }
}