class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        
        int so1 = a+b+c;
        int so2 = so1*((int)Math.pow(a,2)+(int)Math.pow(b,2)+(int)Math.pow(c,2));
        int so3 = so2*((int)Math.pow(a,3)+(int)Math.pow(b,3)+(int)Math.pow(c,3));
        
        
        if(a==b && b==a && a==c)
        {
            answer = so3;
        }
        else
        {
            if(a==b&&a!=c&&b!=c)
            {
                answer = so2;
            }
            else if(a==c&&a!=b&&b!=c)
            {
                answer = so2;
            }
            else if(b==c&&a!=c&&a!=b)
            {
                answer = so2;
            }
            else
            {
                answer = so1;
            }
        }
        return answer;
    }
}