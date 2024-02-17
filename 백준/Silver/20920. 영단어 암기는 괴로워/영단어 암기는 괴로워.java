import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;
import java.util.Comparator;


public class Main 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st1.nextToken());
        int m = Integer.parseInt(st1.nextToken());
        
        for(int i=0; i<n; i++)
        {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            String word = st2.nextToken();
            
            if(word.length()>=m)
            {
            	map.put(word, map.getOrDefault(word,0)+1);
            }
        }
        
        List<String> words = new ArrayList<>(map.keySet());
        
        //단어 리스트 정렬
        Collections.sort(words, new Comparator<String>()
        {
            @Override
            public int compare(String s1, String s2)
            {
                //빈도수가 높은 단어 순서대로 정렬
                if(Integer.compare(map.get(s1), map.get(s2))!=0)
                {
                    return Integer.compare(map.get(s2), map.get(s1));
                }
                
                //빈도수가 같으면 길이가 긴 단어가 먼저 오도록 정렬
                if(s1.length() != s2.length())
                {
                    return s2.length()-s1.length();
                }
                
                //빈도수와 길이가 같으면 사전 순으로 정렬
                return s1.compareTo(s2);
            }
        });
        
        for(String w : words)
        {
            bw.write(w);
            bw.newLine();
        }
        
        bw.flush();
        bw.close();

    }
        
}
