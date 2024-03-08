import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st;
        st= new StringTokenizer(br.readLine());
        int row_A = Integer.parseInt(st.nextToken());
        int col_A = Integer.parseInt(st.nextToken());
        
        int A[][] = new int[row_A][col_A];
        for(int i=0; i<row_A; i++)
        {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<col_A;j++)
            {
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        st = new StringTokenizer(br.readLine());
        int row_B = Integer.parseInt(st.nextToken());
        int col_B = Integer.parseInt(st.nextToken());
        
        int B[][] = new int[row_B][col_B];
        for(int i=0; i<row_B; i++)
        {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<col_B;j++)
            {
                B[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        int AB[][] = new int[row_A][col_B];
        for(int i=0; i<row_A; i++)
        {
            for(int j=0; j<col_B; j++)
            {
                for(int k=0; k<row_B; k++)
                {
                    AB[i][j] +=A[i][k]*B[k][j];
                }
            }
        }
        
       for(int i=0; i<AB.length; i++)
       {
    	   for(int j=0; j<AB[i].length;j++)
    	   {
    		   bw.write(AB[i][j]+" ");
    	   }
    	   bw.newLine();
       }
        bw.flush();
        bw.close();
    }
}
