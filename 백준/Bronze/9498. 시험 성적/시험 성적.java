import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        while(true)
        {
            if(num>=90){
                System.out.println("A");
                break;
            }else if(num>=80){
                System.out.println("B");
                break;
            }else if(num>=70){
                System.out.println("C");
                break;
            }else if(num>=60){
                System.out.println("D");
                break;
            }
            else{
                System.out.println("F");
                break;
            }
        }
    }
}