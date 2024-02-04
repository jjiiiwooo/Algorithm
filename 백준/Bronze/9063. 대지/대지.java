import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        int x[] = new int[num];
        int y[] = new int[num];
        
        int xx =0;
        int yy =0;
        
        for(int i=0; i<num; i++)
        {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        
        Arrays.sort(x);
        Arrays.sort(y);
        
        xx = (x[x.length-1]-x[0]);
        yy = (y[y.length-1]-y[0]);
        
        System.out.println(xx*yy);
            
    }
}