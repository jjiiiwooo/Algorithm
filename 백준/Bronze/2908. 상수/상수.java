import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int na = reverseInt(a);
        int nb = reverseInt(b);
        
        if(na>nb)
            System.out.println(na);
        else 
            System.out.println(nb);
    }
    
  //숫자 뒤집기 메소드 
    //숫자를 10으로 나눈 나머지를 계속 더해줘야 함
    //더하기를 할 때, 기존 숫자에 곱하기 10을 해주어야 자릿수를 하나씩 넘길 수 있음
    public static int reverseInt(int n)
    {
        int answer = 0;
        
        while(n!=0)
        {
            answer = answer*10 + n%10;
            n/=10;
        }
        
        return answer;
    }
}
