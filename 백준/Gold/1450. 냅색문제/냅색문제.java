import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	static int N,C;
    
    //이진 탐색
    static int binarySearch(ArrayList<Integer> sum, int target)
    {
        int left =0,right = sum.size()-1, mid,answer = -1;
        
        while(left<=right)
        {
            mid = (left+right)/2;
            if(sum.get(mid)<=target)
            {
                answer = mid;
                left = mid +1; 
            }
            else
            {
                right = mid -1;
            }
        }
        return answer;
    }
    
    //dfs
    static void dfs(int idx, int sum, ArrayList<Integer> weight, ArrayList<Integer> answer)
    {
        //3. 탈출 조건
        if(sum > C) return;
        
        if(idx == weight.size())
        {
            answer.add(sum);
            return;
        }
        
        //1. 물건을 넣는 경우
        dfs(idx+1, sum+weight.get(idx), weight, answer);
        
        //2. 물건을 넣지 않는 경우 
        dfs(idx+1, sum, weight, answer);
    }
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken()); 
        C = Integer.parseInt(st.nextToken());
        ArrayList<Integer> weight1 = new ArrayList<>();
        ArrayList<Integer> weight2 = new ArrayList<>();
        
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++)
        {
            if(i<N/2)
            {
                weight1.add(Integer.parseInt(st.nextToken()));
            }
            else
            {
                weight2.add(Integer.parseInt(st.nextToken()));
            }
        }
        
        //1. dfs로 sum1 , sum2 만들기 
        ArrayList<Integer>sum1 = new ArrayList<>();
        ArrayList<Integer>sum2 = new ArrayList<>();
        
        dfs(0,0,weight1,sum1); 
        dfs(0,0,weight2,sum2); 
        
        //2. sort 및 binary search
        Collections.sort(sum2);
        int answer = 0;
        for(int i=0; i<sum1.size(); i++)
        {
            //C라는 최댓값에서 현재의 값을 빼면 sum2에서 찾아야 될 값이 담김
            int searchValue = C - sum1.get(i);
            answer +=binarySearch(sum2, searchValue)+1;
        }
        
        bw.write(String.valueOf(answer));
        
        bw.flush();
        bw.close();
        
    }
}