import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
       
        int count[] = new int[26];
        
        String s = sc.nextLine();
        
        for(int i=0; i<count.length; i++)
        {
            count[i] = -1;
        }
        
        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            
            if(count[ch-'a']==-1)
            {
                count[ch-'a']=i;
            }
        }
        
        for(int j=0; j<count.length; j++)
        {
            System.out.print(count[j]+" ");
        }
    }
}