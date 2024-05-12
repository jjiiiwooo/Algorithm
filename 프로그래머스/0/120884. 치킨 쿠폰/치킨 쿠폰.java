class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int coupon = chicken;
        
        while(coupon>9)
        {
            answer+=coupon/10;
            int service = coupon/10;
            int left = coupon%10;
            coupon = left+service;
        }
        return answer;
    }
}