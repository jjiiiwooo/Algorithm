import java.util.Scanner;
/*
100*100인 색종이 배열을 처음에 0으로 초기화 후 
색종이가 들어오면 그 너비 만큼 1로 채움 
마지막에 1의 개수를 전부 세면 색종이가 붙은 전체 너비가 나옴
*/

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt(); //색종이 수 
        int white[][] = new int[101][101]; //도화지
        int total = 0; //검은 영역의 너비 
        
        for(int i=0; i<num; i++)
        {
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            //(x,y)부터 (x+9, y+9)까지의 영역을 하나씩 체크한 후 
            //총 너비에 더해줌 
            for(int j=x; j<x+10; j++){
                for(int k=y; k<y+10; k++)
                {
                    if(white[j][k]!=1)
                    {
                        white[j][k] = 1;
                        total++;
                    }
                }
            }
        }
        System.out.print(total);
 
        
    }
}