import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char temp;
        String result="";
        
        for(int i=0; i<a.length(); i++)
        {
            temp = a.charAt(i);
            
            if((65<=temp)&&(temp<=90))
            {
                result += a.valueOf(temp).toLowerCase();
            }
            else if((97<=temp)&&(temp<=122))
            {
                result += a.valueOf(temp).toUpperCase();
            }
            else
            {
                result+=(char)temp;
            }

        }
        
        System.out.println(result);
    }
}