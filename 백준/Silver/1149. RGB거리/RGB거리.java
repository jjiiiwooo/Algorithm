import java.util.Scanner;

/*N번째 집을 RGB 중 하나로 색칠을 할 떄, N-1번 째 집에서 N번 째에 색칠된
동일한 색과는 다른색 2가지 중 색칠하는 비용이 적은 것으로 선택하면 최소비용을 선택할 수 있다.*/

public class Main 
{
    final static int Red = 0;
    final static int Green = 1;
    final static int Blue = 2;
    
    static int Cost[][];
    static int memo[][];
    
    public static void main(String[] args) 
    {
    	Scanner sc = new Scanner(System.in);
    	
    	int  n = sc.nextInt();
    	
    	Cost = new int[n][3];
    	memo = new int[n][3];
    	
    	for(int i=0; i<n; i++)
    	{
    		Cost[i][Red] = sc.nextInt();
    		Cost[i][Green] = sc.nextInt();
    		Cost[i][Blue] = sc.nextInt();
    	}
    	
    	//memo의 첫 번째 값(집)은 각 색상비용의 첫 번째 값으로 초기화
    	memo[0][Red] = Cost[0][Red];
    	memo[0][Green] = Cost[0][Green];
    	memo[0][Blue] = Cost[0][Blue];
    	
    	System.out.print(Math.min(Paint_cost(n- 1, Red), Math.min(Paint_cost(n - 1, Green), Paint_cost(n - 1, Blue))));
    }
    
    static int Paint_cost(int n, int color)
    {
    	//만약 탐색하지 않은 배열이라면
    	if(memo[n][color] == 0)
    	{
    		//color의 색에 따라 이전 집의 서로 다른 색을 재귀 호출하여 최솟값과 현재 집의 비용을 더해서 memo에 저장
    		if(color == Red) {
				memo[n][Red] = Math.min(Paint_cost(n - 1, Green), Paint_cost(n - 1, Blue)) + Cost[n][Red];
			}
			else if(color == Green) {
				memo[n][Green] = Math.min(Paint_cost(n- 1, Red), Paint_cost(n - 1, Blue)) + Cost[n][Green];
			}
			else {
				memo[n][Blue] = Math.min(Paint_cost(n - 1, Red), Paint_cost(n - 1, Green)) + Cost[n][Blue];
			}
    	}
    	
    	return memo[n][color];
    }
}