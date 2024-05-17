
import java.util.*;


class Solution
{
	
	//배열에서 최댓값인덱스 찾기
	public static int getMax(int num[])
	{
		int max = Integer.MIN_VALUE;
		int idx = 0;
		for(int i=0; i<num.length; i++)
		{
			if(max<num[i])
			{
				max = num[i];
				idx = i;
			}
		}
		return idx;
	}
	
	//배열에서 최솟값 찾기 
	public static int getMin(int num[])
	{
		int min = Integer.MAX_VALUE;
		int idx = 0;
		for(int i=0; i<num.length; i++)
		{
			if(num[i]<min)
			{
				min = num[i];
				idx = i;
			}
		}
		return idx;
	}
	
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);

		for(int tc = 1; tc <= 10; tc++)
		{
			int count = sc.nextInt(); //덤프할 수 있는 최소 횟수 
			int box[] = new int[100];
			
			//상자 높이 입력받기 
			for(int i=0; i<100; i++)
			{
				box[i] = sc.nextInt();
			}
			
			//가장 높은 곳에 있는 상자를 가장 낮은 곳으로 옮기기 
			for(int i=0; i<count; i++)
			{
				int maxidx = getMax(box);
				int minidx = getMin(box);
				
				box[maxidx] -=1; //최댓값 에서 1빼기
				box[minidx] +=1; //최소값 에서 1더하기 
			}
			
			int answer = box[getMax(box)] - box[getMin(box)];
			
			System.out.printf("#%d %d\n",tc,answer);
			

		}
	}
}