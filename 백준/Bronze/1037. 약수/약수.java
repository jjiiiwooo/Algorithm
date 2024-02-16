import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        int input[] = new int[n];
        
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++)
        {
            input[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(input);
        
        int result = input[0]*input[input.length-1];
        
        bw.write(result+"");
        bw.flush();
        bw.close();
    }
}