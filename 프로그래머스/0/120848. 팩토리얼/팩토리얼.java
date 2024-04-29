class Solution {
    static int factorial(int n)
    {
        return (n>0)? n*factorial(n-1):1;
    }
    
    //n이하의 최대 팩토리얼
    public int solution(int n) {
        int answer = 0;
        int i=0;
        
       while(factorial(++i)<=n)
       {
           answer++;
       }
        
        return answer;
    }
}