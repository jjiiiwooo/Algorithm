class Solution {
    public int solution(String num_str) {
        int answer[] = new int[num_str.length()];
        
        int sum = 0;
        for(int i=0; i<num_str.length(); i++)
        {
            answer[i] = num_str.charAt(i) -'0';
            sum+=answer[i];
        }
        return sum;
    }
}