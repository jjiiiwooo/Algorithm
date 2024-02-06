import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    //카운팅 정렬
    static void countingSort(int[] a, int n, int max)
    {
        int f[] = new int[max+1]; //누적 도수 
        int b[] = new int[n]; //작업용 목표 배열 
        
        for(int i=0; i<n; i++)
        {
             f[a[i]]++;
        }
        for(int i=1; i<=max; i++)
        {
             f[i]+=f[i-1];  
        }
        for(int i=n-1; i>=0; i--)
        {
            b[--f[a[i]]] = a[i];
        }
        for(int i=0; i<n; i++)
        {
            a[i]=b[i];
        }
    }
    
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int num = Integer.parseInt(br.readLine());
        int n[] = new int[num];
        
        for(int i=0; i<num; i++)
        {
            n[i] = Integer.parseInt(br.readLine());
        }
        
        int max = n[0];
        for(int i=1; i<num; i++)
        {
            if(n[i]>max)
                max=n[i];
        }
      
        countingSort(n,num,max);
        
        for(int i=0; i<num; i++)
        {
            bw.write(Integer.toString(n[i])+"\n");
        }
        
        bw.flush();
        bw.close();

    }
}