import java.util.*;

class Solution {    
    
    public static void main(String args[]) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        
        for (int t = 1; t <= T; t++)
        { 
        	System.out.println("#" + t + " " 
                    + new String(Base64.getDecoder().decode(sc.nextLine())));
        }
    }
}
