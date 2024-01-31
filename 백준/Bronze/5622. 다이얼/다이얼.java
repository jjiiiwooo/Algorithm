import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {
    public static void main(String[] args) throws IOException
    {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String s = br.readLine();
        char ch[] = s.toCharArray(); //문자열을 char형 배열로 변환 
        int arr[]= new int[ch.length];
        
        for(int i=0; i<s.length(); i++)
        {
            if((ch[i] == 'A')||(ch[i]=='B')||(ch[i]=='C'))
                arr[i]=2;
            if((ch[i]== 'D')||(ch[i]=='E')||(ch[i]=='F'))
                arr[i]=3;
            if((ch[i]== 'G')||(ch[i]=='H')||(ch[i]=='I'))
                arr[i]=4;
            if((ch[i]== 'J')||(ch[i]=='K')||(ch[i]=='L'))
                arr[i]=5;
            if((ch[i]== 'M')||(ch[i]=='N')||(ch[i]=='O'))
                 arr[i]=6;
            if((ch[i]== 'P')||(ch[i]=='Q')||(ch[i]=='R')||(ch[i]=='S'))
                arr[i]=7;
            if((ch[i]== 'T')||(ch[i]=='U')||(ch[i]=='V'))
                arr[i]=8;
            if((ch[i]== 'W')||(ch[i]=='X')||(ch[i]=='Y')||(ch[i]=='Z'))
                arr[i]=9;
            	
        }
        
        int sum=0;
        for(int i=0; i<arr.length;i++)
        {
            arr[i] = arr[i]+1;
            sum+=arr[i];
        }
        
        bw.write(sum+"");
        bw.flush(); //남아있는 데이터를 모두 출력
        bw.close(); //스트림을 닫음 
    
    }
}