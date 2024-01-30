import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String croatia[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        int index =0;
        String s = sc.nextLine();
      
        for(int i=0; i<croatia.length; i++)
        {
            index = s.indexOf(croatia[i]);
            if(index>=0)
            	s=s.replaceAll(croatia[i],"T");
        }
        System.out.println(s.length());

    }
}