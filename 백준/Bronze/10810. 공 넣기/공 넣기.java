import java.util.Scanner;
 /*N개의 바구니는 N-1에 위치한 배열*/

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(); //바구니 개수
        int M = sc.nextInt(); //공 넣는 횟수
        int arr[] = new int[N];
        
        int start = 0;
        int end = 0;
        int ballnum=0;
        
        for(int i=0; i<M; i++)
        {
            start = sc.nextInt()-1;
            end = sc.nextInt()-1;
            ballnum = sc.nextInt();
            
            for(int j=start; j<=end; j++)
            {
                arr[j] = ballnum;
            }
        }
        
        //배열 출력
        for(int i=0; i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        
       
        
    }
}