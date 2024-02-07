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
        
        int xy[][] = new int[num][2];
        
        for(int i=0; i<num; i++)
        {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int x = Integer.parseInt(st.nextToken());
        	int y = Integer.parseInt(st.nextToken());
        	
        	xy[i][0] = x;
        	xy[i][1] = y;
        }
        
      Arrays.sort(xy, new Comparator<int[]>() {
    	  @Override
    	  public int compare(int[] o1, int[] o2) {
    		  if(o1[0] == o2[0])
    			  //두 번째 기준으로 오름차순
    			  return o1[1] -o2[1];
    		  else
    			  //첫 번째 기준으로 오름차순
    			  return o1[0]-o2[0];
    	  }
      });
       
      for(int[] i : xy) {
    	  bw.write(i[0]+" "+i[1]);
    	  bw.write("\n");
      }
      
      bw.flush();
      bw.close();
        
    }
}