import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //바구니 개수
        int M = sc.nextInt(); //교환 횟수 
        int arr[] = new int[N]; //바구니 배열 
        int temp=0;
        int a=0;
        int b=0;
        
        //원 배열 초기화 
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = i+1;
        }
        
        //교환
        for(int i=0; i<M; i++)
        {
            a = sc.nextInt()-1;
            b = sc.nextInt()-1;
            
            temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp; 
        }
        
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        
        sc.close();
        
        
        
    }
}