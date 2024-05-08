import java.util.*;

class Solution {    
    
    public static void main(String args[]) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        
        String arr[] = {"0","1","2","3","4","5","6","7","8","9"};
        
        for (int t = 1; t <= T; t++)
        { 
        	int N = sc.nextInt();
        	
        	Set<String> set = new HashSet<String>();
        	int ans = 1;
        	
        	while(true)
        	{
        		
        		String s = String.valueOf(N*ans);
            		
            	for(int i=0; i<s.length(); i++)
            	{
            		set.add(String.valueOf(s.charAt(i)));
            	}
            	ans++;
            	
                //set과 arr이 동일하다면 break;
            	if(Arrays.equals(arr,set.toArray()))
            	{
            		break;
            	}
        	}
        	
        	System.out.printf("#%d %d\n",t,N*(ans-1));
        }
    }
}