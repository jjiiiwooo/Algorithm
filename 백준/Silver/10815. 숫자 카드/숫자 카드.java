import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    
	//요솟수가 n개인 배열 a에서 key와 같은 요소를 이진 검색 
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
    
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        int n = Integer.parseInt(br.readLine());
        int card[] = new int[n];
        
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++)
        {
            card[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(card);
        int m = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<m; i++)
        {
            int temp = Integer.parseInt(st.nextToken());
            sb.append(binSearch(card,n,temp)+" ");
        }
        
        bw.write(sb.toString()+"\n");
        bw.flush();
        bw.close();
    }
}
