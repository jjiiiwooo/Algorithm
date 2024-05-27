class Solution {
    //최대 공약수 
    public static int gcd(int n, int m)
    {
        if(m==0)
        {
            return n;
        }
        else
        {
            return gcd(m,n%m);
        }    
    }
    //최소 공배수 = 두 자연수의 곱 / 최대 공약수 
    public static int lcm(int n, int m)
    {
        int gcd = gcd(n,m);
        return (n*m)/gcd;
    }
    public int[] solution(int n, int m) {
        int[] answer = {gcd(n,m),lcm(n,m)};
        
        return answer;
    }
}