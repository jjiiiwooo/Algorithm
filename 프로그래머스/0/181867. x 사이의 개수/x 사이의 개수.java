class Solution {
    public int[] solution(String myString) {
        String result[] = myString.split("x");
        
        int answer1[] = new int[result.length];
        int answer2[] = new int[result.length+1];
        
        if(myString.endsWith("x"))
        {
            for(int i=0; i<result.length; i++)
            {
                answer2[i] = result[i].length();
            }
            answer2[result.length] = 0;
            
            return answer2;
        }
        else
        {
            for(int i=0; i<result.length; i++)
            {
                answer1[i] = result[i].length();
            }
            return answer1;
        }
    }
}