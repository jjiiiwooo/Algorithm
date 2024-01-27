import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        double[] arr = new double[num]; //배열 선언
        double max=0;
        double sum=0;
        double avg=0;
        
        //num개의 원점수 입력
        for(int i=0; i<num; i++)
        {
            arr[i] = sc.nextInt();
            //그 중 최댓값 구하기 
            if(arr[i]>max) max = arr[i];
        }
        //새로운 점수 배열 
        for(int j=0; j<num; j++)
        {
            arr[j] = (arr[j]/max)*100;
            sum+=arr[j];
        }
        
        avg = sum/num;
        System.out.println(avg);
        
        sc.close();
    }
}