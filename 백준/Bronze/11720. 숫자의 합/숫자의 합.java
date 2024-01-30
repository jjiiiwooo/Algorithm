import java.util.Scanner;
/*
charAt으로 추출한 문자는 고유의 아스키 코드값을 가짐 
*/

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        String s = sc.next(); //숫자를 문자열로 입력받음 
        
        int sum = 0;
        
        for(int i=0; i<num; i++)
        {
            sum +=s.charAt(i)-'0';
        }
        System.out.println(sum);
    }
}
    