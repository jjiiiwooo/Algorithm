import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        Integer num[] = new Integer[n]; //Wrapper 클래스로 선언
        
        for(int i=0; i<n; i++)
        {
            num[i] = sc.nextInt();
        }
        
        Arrays.sort(num, Collections.reverseOrder()); //내림차순
        
        System.out.println(num[k-1]);
        	    
    }
}