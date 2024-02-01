import java.util.Scanner;
/*
6씩 증가하는 등차 수열 
6씩 증가해서 그 사이에 들어갈 때마다 방이 1개씩 증가
*/

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int input = sc.nextInt();
        int room =1; //지나가는 방의 수 
        int range =1; //범위 
        
       while(true)
       {
           if(input<=range)
           {
               System.out.println(room);
               break;
           }
           
           range = range + (6*room);
           room +=1;
       }
 
    }
}