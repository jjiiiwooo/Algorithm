
import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for(int t = 1; t <= T; t++)
		{
			int answer = 0;
            for(int i=0; i<10; i++)
            {
                int num = sc.nextInt();
                
                if(num%2==1)
                {
                    answer +=num;
                }
            }
            
            System.out.printf("#%d %d\n", t, answer);
        }

		}
	}