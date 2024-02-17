import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    static int count = 0;
    static int tmp[];
    static int A[];
    static int result = -1;
    static int k;
    
    public static void merge_sort(int[] A,int p,int r) {
		if(count>k) return;
		if(p<r) {
			int q= (p+r)/2; 
			merge_sort(A,p,q); //앞부분 병합 정렬
			merge_sort(A,q+1,r); //뒷부분 병합 정렬
			merge(A,p,q,r); //병합
		}
	}

	public static void merge(int[] A,int p,int q,int r) {
	
		int i=p; 
		int j=q+1;
		int t=0;
        
		while(i<=q && j<=r) {
			if(A[i]<=A[j]) {
				tmp[t++] = A[i++];
			}else {
				tmp[t++]=A[j++];
			}
		}
		while(i<=q) {
			tmp[t++]=A[i++];
		}
		while(j<=r) {
			tmp[t++]=A[j++];
		}
		i=p;t=0;
		while(i<=r) {
			count++;
            if(count == k)
            {
                result = tmp[t];
                break;
            }
            A[i++] = tmp[t++];
			}
	}
    
    
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        A = new int[n];
        for(int i=0; i<n; i++)
        {
            A[i] = Integer.parseInt(st.nextToken());
        }
        tmp = new int[n];
        merge_sort(A,0,n-1);
        bw.write(result+"");
        
        bw.flush();
        bw.close();
        
    }
}