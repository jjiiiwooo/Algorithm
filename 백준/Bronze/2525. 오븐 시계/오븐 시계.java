import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int h = sc.nextInt();
        int m = sc.nextInt();
        int num = sc.nextInt();
        
        int htom = 60*h+m;
        int newnum = htom+num;
        
        int hour = (newnum/60)%24;
        int min = newnum%60;
        
        System.out.println(hour+" "+min);
        
        sc.close();
    }
}