import java.util.Scanner;
import java.util.Arrays;

/*
w-x, h-y, x,y 중 누가 제일 작은지 
*/

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        
        int nx = w-x;
        int ny = h-y;
        
        
        int arr[] = new int[4];
        arr[0] = nx;
        arr[1] = ny;
        arr[2] = x;
        arr[3] = y;
        
        
        Arrays.sort(arr);
        
        System.out.println(arr[0]);
        
    }
}