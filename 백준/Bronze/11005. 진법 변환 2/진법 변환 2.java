import java.util.Scanner;

public class Main {
    static int converse(int x, int r, char[] d)
    {
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        
        do{
            d[digits++] = dchar.charAt(x%r);
            x/=r;
        }while(x!=0);
        
        for(int i=0; i<digits/2; i++){
            char t = d[i];
            d[i] = d[digits-i-1];
            d[digits-i-1] =t;
        }
        
        return digits;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(); //10진법 수 
        int B = sc.nextInt(); //B진법으로 
        int dno=0; //변환 후의 자릿수
        char[] ch = new char[32]; //변환 후 각 자리의 숫자를 넣어 두는 배열
        
        dno =converse(N,B,ch);
        
        for(int i=0; i<dno; i++)
        {
            System.out.print(ch[i]);
        }

    }
}