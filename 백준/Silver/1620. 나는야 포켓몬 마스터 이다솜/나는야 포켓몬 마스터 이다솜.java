import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.HashMap;

public class Main {
	
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        //질문이 숫자일 때 
        HashMap<Integer, String> map1 = new HashMap<Integer,String>();
        //질문이 문자일 때
        HashMap<String,Integer> map2 = new HashMap<String,Integer>();
        
        int n = Integer.parseInt(st.nextToken()); //도감에 수록된 포켓몬의 개수
        int m = Integer.parseInt(st.nextToken()); //질문 개수 
        
        
        for(int i=1; i<=n; i++)
        {
        	String poketmon = br.readLine();
        	map1.put(i, poketmon);
        	map2.put(poketmon, i);
        }
        
        for(int i=0; i<m; i++)
        {
        	String query = br.readLine();
        	
        	//질문이 숫자이면 포켓몬 이름 반환
        	if(49<=query.charAt(0) && query.charAt(0)<=57)
        	{
        		bw.write(map1.get(Integer.parseInt(query)));
        	}
        	else //질문이 포켓몬 이름이면 숫자 반환
        	{
        		bw.write(map2.get(query)+"");
        	}
        	bw.newLine();
        }
        
        
       
        bw.flush();
        bw.close();
        
    }
}