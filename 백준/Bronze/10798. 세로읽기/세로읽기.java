import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int max = 0; //입력받는 문자열 중 가장 긴 문자열
        
        char arr[][] = new char[5][15];
        
        for(int i=0; i<5; i++)
        {
            String s = sc.next();
            max = Math.max(max,s.length());
            
            for(int j=0; j<s.length(); j++)
            	arr[i][j] = s.charAt(j);
        }
        
        
        for(int i=0; i<max; i++){
        	for(int j=0; j<5; j++) {
        		if(arr[j][i]=='\0') {
        			continue;
        		}
        		System.out.print(arr[j][i]);
        	}
        }

    }
}