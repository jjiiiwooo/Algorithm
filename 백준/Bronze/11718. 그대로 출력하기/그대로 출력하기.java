import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String s;
        
        //입력이 null일때까지 while문을 반복하여 출력
        while((s=br.readLine())!=null)
        {
        	  System.out.println(s);
        }
        br.close();

    }
}