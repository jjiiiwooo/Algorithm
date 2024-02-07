import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int num = Integer.parseInt(br.readLine());
        
        String signup[][] = new String[num][2];
        
        for(int i=0; i<num; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String age = st.nextToken();
            String name = st.nextToken();
            
            signup[i][0] = age;
            signup[i][1] = name;
        }
        
        //나이 순 정렬
        Arrays.sort(signup, new Comparator<String[]>() {
			@Override
			public int compare(String[] s1, String[] s2) {
				return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
			}
			
		});
        
        for(String[] s : signup)
        {
        	bw.write(s[0]+" "+s[1]);
        	bw.write("\n");
        }
        
        bw.flush();
        bw.close();
    }
}