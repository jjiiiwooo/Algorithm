
class Solution {
    
    // a와 b의 최대 공약수
    public int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a % b);
    }
    
    // 약수 중 2와 5를 포함하는지 확인
    public boolean check(int num) {
        while (num % 2 == 0) {
            num /= 2;
        }
        while (num % 5 == 0) {
            num /= 5;
        }
        return num == 1;
    }
    
    public int solution(int a, int b) {
        int answer = 0;
        
        // 기약 분수로 만들기 
        int gcdValue = gcd(a, b); 
        a /= gcdValue; // 분자
        b /= gcdValue; // 분모
        
        // 분모가 2와 5의 배수만을 가지는지 확인
        if (check(b)) {
            answer = 1; 
        } else {
            answer = 2; 
        }
        
        return answer;
    }
}
