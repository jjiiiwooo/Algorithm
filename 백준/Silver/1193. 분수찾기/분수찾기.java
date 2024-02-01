import java.util.Scanner;
/*
1번째 그룹  1/1
2번째 그룹 1/2, 2/1
3번째 그룹 3/1, 2/2, 1/3
4번째 그룹 1/4, 2/3, 3/2, 4/1

홀수 그룹은 분자가 감소 && 분모 증가 
짝수 그룹은 분자가 증가 && 분모 감소 
*/

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int input = sc.nextInt();
        int n = 0;
        int max =1;
        int min =1;
        int group = 0;
        
        if(input == 1)
        {
            System.out.println("1/1");
        }
        else 
        {
            while(group<input)
            {
                n++;
                group = n*(n+1)/2; //몇 번째 그룹인지 
            }
            int num = input-(n-1)*n/2; //그룹의 몇번 째값인지
            if(n%2==0)
            {
                //짝수 행일시 
                max=num;
                min=n-num+1;
            }else {
                max=n-num+1;
                min=num;
            }
            System.out.println(max+"/"+min);
        }

    }
}