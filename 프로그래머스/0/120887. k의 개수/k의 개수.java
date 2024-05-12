class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        char kstr = (char)(k+'0');
        
        String arr[] = new String[j-i+1];
        
        int idx = 0;
        for(int n=i; n<=j; n++)
        {
            arr[idx++] = String.valueOf(n);
        }
        
        for(int s=0; s<arr.length; s++)
        {
            String cur = arr[s];
            for(int c=0; c<cur.length(); c++)
            {
                if(cur.charAt(c)==kstr)
                {
                    answer++;
                }
            }
        }
        return answer;
    }
}