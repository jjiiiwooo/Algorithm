import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int X = sc.nextInt();
        int arr[] = new int[num];
        
        for(int i=0; i<num; i++)
        {
            arr[i] = sc.nextInt();
        }
        
        for(int j=0; j<num; j++)
        {
            if(arr[j]<X)
            {
                System.out.print(arr[j]+" ");
            }
        }
        
        sc.close();
    }
}