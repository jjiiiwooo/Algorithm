import java.util.*;

class Solution {
    //기울기 
    public double gradient(int a[], int b[])
    {
        return (double)(a[1]-b[1])/(a[0]-b[0]);
    }
    
    public int solution(int[][] dots) {
        int answer = 0;
        
        int p1[] = dots[0];
        int p2[] = dots[1];
        int p3[] = dots[2];
        int p4[] = dots[3];
        
        boolean check1 = gradient(p3,p1)==gradient(p4,p2);
        boolean check2 = gradient(p4,p3)==gradient(p2,p1);
        
        if(check1 || check2)
        {
            answer = 1;
        }
        else
        {
            answer = 0;
        }
        return answer;
    }
}