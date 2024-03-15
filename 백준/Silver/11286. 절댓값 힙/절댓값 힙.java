import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        AbsComparator abscomparator = new AbsComparator();
        //우선순위가 낮은 순 = 최소힙
        PriorityQueue<Integer> pq = new PriorityQueue<>(abscomparator);
        
        
        int N = Integer.parseInt(br.readLine());
        
        StringTokenizer st;
        for(int i=0; i<N; i++)
        {
            st = new StringTokenizer(br.readLine());
            int value = Integer.parseInt(st.nextToken());
            
            //값 제거 
            if(value == 0)
            {
                if(pq.isEmpty())
                {
                    sb.append("0").append("\n");
                }
                else
                {
                    int ans = pq.poll();
                    sb.append(ans).append("\n");
                }
            }
            //값 추가 
            else
            {
                pq.add(value);
            }
        }
        
        System.out.println(sb);
    }
}

//우선순위 비교 클래스 생성 
class AbsComparator implements Comparator<Integer>
{
	@Override
	public int compare(Integer o1, Integer o2)
	{
		Integer a = Math.abs(o1);
		Integer b = Math.abs(o2);
		
		if(a>b)
		{
			return 1;
		}
		else if(a<b)
		{
			return -1;
		}
		else //절댓값이 같다면 
		{
			if(o1>o2)
			{
				return 1;
			}
			else if(o1<o2)
			{
				return -1;
			}
			else
			{
				return 0;
			}
		}
	}
}
