import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        
        //특정 문자열을 구분자를 통해 잘라서 관리할 수 있는 클래스 
        StringTokenizer st = new StringTokenizer(s," ");
        
        //countTokens = 구분자를 통해 생성되는 토큰의 개수 
        System.out.println(st.countTokens());
    }
}