import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        String s = br.readLine();
        char c[] = s.toCharArray();
    
        if(c[0]== '"' && c[s.length()-1]=='"' && s.length()>2)
        {
            for(int i=1; i<c.length-1; i++)
            {
            	System.out.print(c[i]);
            }
        }
        else 
        {
            System.out.println("CE");
        }
        
    } 
}