import java.util.Scanner;
import java.util.Arrays;


public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int a[] = new int[3];
        
        a[0] = sc.nextInt();
        a[1] = sc.nextInt();
        a[2] = sc.nextInt();
        
        Arrays.sort(a);
        
        if(a[0]+a[1]>a[2])
        	System.out.println(a[0]+a[1]+a[2]);
        else
        {
        	a[2] = a[0]+a[1]-1;
        	System.out.println(a[0]+a[1]+a[2]);
        }
        
    }
}