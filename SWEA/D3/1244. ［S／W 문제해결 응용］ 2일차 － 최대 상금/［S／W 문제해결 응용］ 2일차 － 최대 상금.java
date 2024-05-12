import java.util.*;
import java.io.*;

class Solution
{
    static char arr[];
    static int n;
    static String result;
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		int T = Integer.parseInt(br.readLine());
	
        StringTokenizer st;
		for(int test_case = 1; test_case <= T; test_case++)
		{
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            arr = s.toCharArray();  
           
            n = Integer.parseInt(st.nextToken());
            
             result = ""; 
            back(0,0);
            System.out.println("#"+test_case+" "+ result);
        }
	}
    
    public static void back(int depth, int count){
        
       if(count==n){
            String current = new String(arr); 
            if (current.compareTo(result) > 0) {  
                result = current;  
            }
           return;
       }
        
       for(int i=depth; i<arr.length;i++){
           for(int j =i+1; j<arr.length; j++){
               change(i, j);
               back(i, count+1);
               change(i,j);
           }
       }
    }
    
    private static void change(int i, int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}