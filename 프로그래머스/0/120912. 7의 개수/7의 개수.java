class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        String str[] = new String[array.length];
        
        for(int i=0; i<array.length; i++)
        {
            str[i] = String.valueOf(array[i]);
        }
        
        for(int i=0; i<str.length; i++)
        {
            for(int j=0; j<str[i].length(); j++)
            {
                if(str[i].charAt(j) == '7')
                    answer++;
            }
        }
        return answer;
    }
}