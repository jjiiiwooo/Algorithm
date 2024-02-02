import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int X[] = new int[3];
        int Y[] = new int[3];
        
        int xn = 0;
        int yn = 0;

        
        for(int i=0; i<3; i++)
        {
        	X[i] = sc.nextInt();
        	Y[i] = sc.nextInt();
        }
        
        
        Arrays.sort(X);
        Arrays.sort(Y);
        
        
        
        if(X[2]==X[1])
        	xn= X[0];
        else
        	xn= X[2];
        
        if(Y[2]==Y[1])
        	yn= Y[0];
        else
        	yn= Y[2];
        
        System.out.println(xn+" "+yn);
    }
}