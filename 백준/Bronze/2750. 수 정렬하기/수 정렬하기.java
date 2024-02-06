import java.util.Scanner;

public class Main {
    
    //교환 
    static void swap (int[] a, int index1, int index2)
    {
        int t = a[index1];
        a[index1] = a[index2];
        a[index2] = t;
    }
    
    //버블 정렬 
    static void bubbleSort(int[] a, int n)
    {
        int k=0;
        while(k<n-1)
        {
            int last = n-1; //마지막으로 요소를 교환한 위치 
            for(int j=n-1; j>k; j--)
            {
                if(a[j-1]>a[j]){
                    swap(a,j-1,j);
                    last=j;
                }
            }
            k=last;
        }
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        int n[] = new int[num];
        
        for(int i=0; i<num; i++)
        {
            n[i] = sc.nextInt();
        }
        
        bubbleSort(n,num);
        
        for(int i=0; i<num; i++)
        {
            System.out.println(n[i]);
        }
    }
        
}

