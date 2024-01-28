import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        int count=0;
        
        int[] arr = new int[num];
        
        
        for(int i=0; i<num; i++)
        {
            arr[i] = sc.nextInt();
        }
        
        int find = sc.nextInt();
        
        for(int j=0; j<arr.length; j++)
        {
            if(find == arr[j])
                count++;
        }
        
        System.out.println(count);
        
        sc.close();
    }
}