class Solution {
    public int solution(String my_string) {
        
        String arr[] = my_string.split(" "); //공백으로 구분 
        
        int answer = Integer.parseInt(arr[0]);
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i].equals("+"))
            {
                answer+=Integer.parseInt(arr[i+1]);
            }
            else if(arr[i].equals("-"))
            {
                answer-=Integer.parseInt(arr[i+1]);
            }
        }
            
        return answer;
    }
}