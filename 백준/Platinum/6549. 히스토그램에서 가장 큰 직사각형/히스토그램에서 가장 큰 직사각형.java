import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

//참고 - https://st-lab.tistory.com/255
public class Main
{
    public static int histogram[];
    
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st;
        
        StringBuilder sb = new StringBuilder();
        
        int N;
        
        while(true)
        {
            st= new StringTokenizer(br.readLine());
            
            N = Integer.parseInt(st.nextToken());
            
            if(N==0)
                break;
            
            histogram = new int[N];
            
            for(int i=0; i<N; i++)
            {
                histogram[i] = Integer.parseInt(st.nextToken());
            }
            sb.append(getArea(0,N-1)).append('\n');
            histogram = null;
            
        }
        System.out.println(sb);
    }
    
    public static long getArea(int start, int end)
    {
        //막대 폭이 1일 경우 
        if(start == end)
        {
            return histogram[start];
        }
        
        int mid = (start+end)/2; //중간지점
        
        //mid를 기점으로 양쪽으로 나누어 양쪽 구간 중 큰 넓이를 저장
        //왼쪽 부분 : start ~ mid
        //오른쪽 부분 : mid+1 ~ end
        long leftArea = getArea(start,mid);
        long rightArea = getArea(mid+1, end);
        
        //왼쪽과 오른쪽 중 큰 넓이를 변수에 저장 
        long max = Math.max(leftArea,rightArea);
        
        //양쪽 구간 중 큰 값과 중간 구간을 비교하여 더 큰 넓이로 갱신
        max = Math.max(max, getMidArea(start,end,mid));
        
        return max;
    }
    
    //중간지점 영역의 넓이를 구하는 메소드 
    public static long getMidArea(int start, int end, int mid)
    {
        int toLeft = mid; //중간 지점으로부터 왼쪽으로 갈 변수 
        int toRight = mid; //중간 지점으로부터 오른쪽으로 갈 변수 
        
        long height = histogram[mid]; //높이 
        
        //초기 넓이 (구간 폭이 1이므로 넓이는 높이가 면적이 됨)
        long maxArea = height;
        
        //양 끝 범위를 벗어나기 전까지 반복
        while(start<toLeft && toRight <end)
        {
            //양쪽 다음 칸의 높이 중 높은 값을 선택하되, 
            //갱신되는 height는 기존 height보다 작거나 같아야 한다.
            if(histogram[toLeft-1] < histogram[toRight+1])
            {
                toRight++;
                height = Math.min(height, histogram[toRight]);
            }
            else
            {
                toLeft--;
                height = Math.min(height, histogram[toLeft]);
            }
            
            //최대 넓이 갱신
            maxArea = Math.max(maxArea,height*(toRight-toLeft+1));
        }
        
        //오른쪽 구간을 끝까지 탐색 못했다면 마저 탐색
        while(toRight < end)
        {
            toRight++;
            height = Math.min(height, histogram[toRight]);
            maxArea = Math.max(maxArea, height*(toRight-toLeft+1));
        }
        
        //왼쪽 구간을 끝까지 탐색 못했다면 마저 탐색
        while(start<toLeft)
        {
            toLeft--;
            height = Math.min(height, histogram[toLeft]);
            maxArea = Math.max(maxArea, height*(toRight-toLeft+1));
        }
        
        return maxArea;
    }
}