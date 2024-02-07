import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;


public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int num = Integer.parseInt(br.readLine());
        int original[] = new int[num];
        int sorted[] = new int[num];
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        String[] input = br.readLine().split(" ");
        for(int i=0; i<num; i++)
        {
        	original[i] = Integer.parseInt(input[i]);
        }
        
        sorted = original.clone();
        
        Arrays.sort(sorted);
        
        int count=0; 
        for(int i=0; i<num; i++)
        {
        	int key=sorted[i];
        	
        	if(!map.containsKey(key))
        	{
        		map.put(key, count++);
        	}
        }
        
        for(int i=0; i<num; i++)
        {
        	int key = original[i];
        	
            bw.write(map.get(key)+" ");
        }
        
        bw.flush();
        bw.close();
        
    }
}