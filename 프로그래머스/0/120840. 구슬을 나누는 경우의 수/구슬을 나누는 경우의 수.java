class Solution {
    static int combination(int n, int m)
    {
        if(m==0 || n==m)
        {
            return 1;
        }
        else
        {
            return combination(n-1,m-1)+ combination(n-1,m);
        }
    }
    
    public int solution(int balls, int share) {
        int answer = 0;
        
        //서로 다른 balls개 중 share를 뽑는 경우의 수
        answer = combination(balls,share);
        
        return answer;
    }
}