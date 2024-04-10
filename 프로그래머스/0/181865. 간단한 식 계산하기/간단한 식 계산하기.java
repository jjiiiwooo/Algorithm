class Solution {
    public int solution(String binomial) {
        int answer = 0;
        
        if(binomial.contains("+"))
        {
            String temp[] = binomial.split("\\+");
            
            answer = Integer.parseInt(temp[0].trim()) + Integer.parseInt(temp[1].trim());
        }
        else if(binomial.contains("-"))
        {
            String temp[] = binomial.split("\\-");
            
            answer = Integer.parseInt(temp[0].trim()) - Integer.parseInt(temp[1].trim());
        }
        else if(binomial.contains("*"))
        {
            String temp[] = binomial.split("\\*");
            
            answer = Integer.parseInt(temp[0].trim()) * Integer.parseInt(temp[1].trim());
        }
        return answer;
    }
}