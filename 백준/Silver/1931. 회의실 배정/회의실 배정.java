import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n  = Integer.parseInt(br.readLine()); //회의실 개수 
        
        int room[][] = new int[n][2];
        int count = 0;
        
       
        for(int i=0; i<n; i++)
        {
        	 StringTokenizer st = new StringTokenizer(br.readLine());
            room[i][0] = Integer.parseInt(st.nextToken());
            room[i][1] = Integer.parseInt(st.nextToken());
            
        }
        
        //종료시간 기준으로 정렬  
        Arrays.sort(room, new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2)
            {
                if(o1[1] == o2[1])
                {
                    return o1[0]-o2[0];
                }
                else
                {
                    return o1[1]-o2[1];
                }
            }
        });
        
        int time = 0;
        
        for(int i=0; i<n; i++)
        {
            if(time<=room[i][0])
            {
            	time = room[i][1];
            	count++;
            }
        }
        
        bw.write(count+"");
        bw.flush();
        bw.close();

        
    }
}
