import java.util.Scanner;
import java.util.StringTokenizer;


public class Main{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		StringTokenizer st;
	
		double sumGrade = 0; //전공과목별 합
		double sumScore = 0; //학점의 총합 
		
		for(int i=0; i<20; i++)
		{
			st = new StringTokenizer(sc.nextLine()," ");
			String subject = st.nextToken(); //과목
			double score = Double.parseDouble(st.nextToken()); //학점
			
			String rating = st.nextToken(); //등급
			double grade = 0; //등급에 맞는 점수 
		
			
			if(!rating.equals("P")) {
				switch(rating) {
				case "A+" :
					grade=4.5;
					break;
				case"A0":
					grade=4.0;
					break;
				case "B+":
					grade=3.5;
					break;
				case "B0":
					grade=3.0;
					break;
				case "C+":
					grade=2.5;
					break;
				case "C0" :
					grade=2.0;
					break;
				case "D+" :
					grade=1.5;
					break;
				case "D0" :
					grade=1.0;
					break;
				case "F":
					grade=0.0;
					break;

				}
				sumGrade += score*grade;
				sumScore+=score;
			}
		}
		sc.close();
		System.out.printf("%.6f",sumGrade/sumScore);

	}
}