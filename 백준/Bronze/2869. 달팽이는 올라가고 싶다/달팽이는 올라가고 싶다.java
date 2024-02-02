import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt(); //up
        int B = sc.nextInt(); //down
        int V = sc.nextInt(); //height
        
        //정상에 올라갔을 때 
        if((V-B)%(A-B)==0)
        {
        	System.out.println((V-B)/(A-B));
        }
        
        //나머지 블록이 남아 있을 떄 
        else 
        {
        	System.out.println(((V-B)/(A-B))+1);
        }

    }
}