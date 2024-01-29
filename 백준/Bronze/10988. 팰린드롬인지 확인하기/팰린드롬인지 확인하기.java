import java.util.Scanner;

public class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();
        String reverse ="";
        
        
        //문자열 뒤집기 
        for(int i=str.length()-1; i>=0; i--)
        {
            reverse = reverse+str.charAt(i);
        }
        
        if(str.equals(reverse))
            System.out.println(1);
        else
            System.out.println(0);
      
        sc.close();
    }
}