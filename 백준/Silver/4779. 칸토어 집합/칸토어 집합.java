import java.util.Scanner;

public class Main {
	
	public static String cantor(int n)
	{
		int size = (int)Math.pow(3, n-1);
	    StringBuilder s = new StringBuilder();
		
		if(n==0)
		{
			return "-";
			
		}
		
		s.append(cantor(n-1));
		for(int i=0; i<size;i++)
		{
			s.append(" ");
			
		}
		s.append(cantor(n-1));	
		
		return s.toString();
	}
	
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int n;
        
        while(sc.hasNext())
        {
        	n = sc.nextInt();
        	System.out.println(cantor(n));
        }
    }
}