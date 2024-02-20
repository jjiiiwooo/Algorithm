import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main 
{
   static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
   public static void main(String[] args) throws IOException 
   {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
       int n = Integer.parseInt(br.readLine()); //원판의 개수 
       
       bw.write((int)(Math.pow(2, n)-1)+"\n");
       
       hanoi(n,1,2,3);
       
       bw.flush();
       bw.close();
	   
   }
   
  
   static void hanoi(int n, int start, int via, int end) throws IOException
   {
         if(n==1)
         {
        	 bw.write(start+" "+end+"\n");
        	 return;
         }
         
         hanoi(n-1,start,end,via);
         bw.write(start+" "+end+"\n");
         hanoi(n-1,via,start,end);
   }
   
}
