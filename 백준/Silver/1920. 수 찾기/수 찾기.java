import java.util.Scanner;
import java.util.Arrays;

public class Main {
	
	static int binSearch(int[] a, int n, int key)
	{
		int pl = 0; //검색 범위의 첫 인덱스 
		int pr = n-1; //검색 범위의 끝 인덱스 
		
		do {
			int pc = (pl+pr)/2; //중앙 요소의 인덱스 
			if(a[pc] ==key)
				return 1; //검색 성공
			else if(a[pc]<key)
				pl=pc+1; //검색 범위를 뒤쪽 절반으로 좁힘
			else
				pr=pc-1; //검색 범위를 앞쪽 절반으로 좁힘
		}while(pl<=pr);
		
		return 0; //검색 실패 
	}
	
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int na = sc.nextInt();
        int A[] = new int[na];
        
        for(int i=0; i<na; i++)
        {
        	A[i] = sc.nextInt();
        }
        
        int nb = sc.nextInt();
        int B[] = new int[nb];
        
        for(int i=0; i<nb; i++)
        {
        	B[i] = sc.nextInt();
        }
        
        Arrays.sort(A);
        
        
        for(int i=0; i<nb; i++)
        {
        	int key = B[i]; //검색할 값
        	
        	int check = binSearch(A,na,key);
        	
        	if(check == 0)
        	{
        		System.out.println(0);
        	}
        	else
        	{
        		System.out.println(1);
        	}
        }
       
    }
}