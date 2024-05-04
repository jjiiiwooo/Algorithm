import java.util.Scanner;
import java.util.Arrays;

class Solution
{
	public static void main(String args[]) throws Exception
	{	
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++)
		{
			int N = sc.nextInt(); //학생수 
			int K = sc.nextInt(); //알고 싶은 학생 
			
			String arr[] = {"D0", "C-", "C0", "C+", "B-", "B0", "B+", "A-", "A0", "A+"}; 
			
			double score[][] = new double[N][3];
			
			for(int i=0; i<N; i++)
			{
				for(int j=0; j<3; j++)
				{
					score[i][j] = sc.nextInt();
				}
			}
			
			//N명의 학생 총점 저장 배열
			Double grade[] = new Double[N];
			for(int i=0; i<N; i++)
			{
				double mid = score[i][0]; //중간 
				double fin = score[i][1]; //기말
				double hw = score[i][2]; //과제
				
				grade[i] = (mid*0.35)+(fin*0.45)+(hw*0.20);
			}
			
			
			String answer ="";
			double goal = grade[K-1];
			//오름차순 정렬 
			Arrays.sort(grade);
			for(int i=0; i<N; i++)
			{
				if(goal==grade[i])
				{
					answer = arr[i/(N/10)];
					break;
				}
			}
			
			System.out.printf("#%d %s\n",t,answer);
		}
	}
}