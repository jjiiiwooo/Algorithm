class Solution {
    public int solution(String number) {        
        int num[] = new int[number.length()];
        char ch[] = number.toCharArray();
        int sum = 0;
        
        for(int i=0; i<number.length(); i++)
        {
            num[i] = ch[i]-'0';
            sum+=num[i];
        }
        
        return sum%9;
        
    }
}