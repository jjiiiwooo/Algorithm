import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        int[] arr = new int[num]; //배열 선언
        int max = 0;
        int min = 0;
        
        for(int i=0; i<num; i++)
        {
            arr[i] = sc.nextInt();
        }
        
        min = arr[0];
        max = arr[0];
        for(int j=0; j<num;j++)
        {
            if(max<arr[j]) max = arr[j];
            if(min>arr[j]) min = arr[j];
        }
        
        System.out.print(min + " " + max);
        
        sc.close();
    }
}