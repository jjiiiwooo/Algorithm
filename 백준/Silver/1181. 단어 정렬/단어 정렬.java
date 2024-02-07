import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;


public class Main {
	
	
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int num = Integer.parseInt(br.readLine());
        String s[] = new String[num];
        
        for(int i=0; i<num; i++)
        {
        	s[i] = br.readLine();
        }
        
        //배열을 HashSet으로 변환 (중복 제거)
        HashSet<String> hashset = new HashSet<>(Arrays.asList(s));
        
        //HashSet을 배열로 변환 (중복이 제거된 배열)
        String result[]= hashset.toArray(new String[0]);
        
        //길이 기준 오름차순 출력
        Arrays.sort(result, new Comparator<String>() {
        	@Override
        	public int compare(String s1, String s2) {
        		if(s1.length() == s2.length())
        		{
        			return s1.compareTo(s2);
        		}
        		else {
        			return s1.length() - s2.length();
        		}
        	}
        });
        
        
        for(int i=0; i<result.length; i++)
        {
        	bw.write(result[i]+"\n");
        }
        
        bw.flush();
        bw.close();
    }
}