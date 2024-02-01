import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int [][]arr = new int[9][9];
        
        for(int i=0; i<9; i++)
        {
            for(int j=0; j<9; j++)
                arr[i][j] = sc.nextInt();
        }
        
        int max = arr[0][0];
        int index1 = 0;
        int index2 = 0;
        for(int i=0; i<9; i++)
        {
            for(int j=0; j<9; j++)
            {
                if(arr[i][j]>=max) {
                	max = arr[i][j];
                	index1 = i+1;
                	index2 = j+1;
                }
                	
            }
                
        }
        
        System.out.println(max);
        System.out.println(index1+" "+index2);
    }
}