import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        // 길이가 N인 int 형 바구니 넘버 배열을 생성
        int[] arr= new int[N];

        for(int i=0; i<arr.length; i++)
        {
            arr[i] = i+1;
        }
        
        for(int j=0; j<M; j++)
        {
            int start = sc.nextInt()-1;
            int end = sc.nextInt()-1;
            
            for(int k=start; k<=end; k++,end--)
            {
                int temp = arr[k];
                arr[k]=arr[end];
                arr[end] = temp;
            }
        }
        
        for(int p=0; p<arr.length;p++)
            System.out.print(arr[p]+" ");
        
        sc.close();
    }
}