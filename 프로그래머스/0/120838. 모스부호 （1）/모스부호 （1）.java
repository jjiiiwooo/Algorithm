class Solution {
    public String solution(String letter) {
        StringBuffer answer = new StringBuffer();
       String[] morse = {".-","-...","-.-.","-..",".","..-.",
                "--.","....","..",".---","-.-",".-..","--","-.",
                "---",".--.","--.-",".-.","...","-","..-","...-",
                ".--","-..-","-.--","--.."};
        
        String lettermorse[] = letter.split(" ");
        
        for(String word : lettermorse)
        {
            for(int i=0; i<morse.length; i++)
            {
                if(word.equals(morse[i]))
                    answer.append(Character.toString(i+97));
            }
        }
        
        
        
        return answer.toString();
    }
}