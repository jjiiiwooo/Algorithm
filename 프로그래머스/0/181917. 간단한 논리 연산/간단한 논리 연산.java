class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        
        boolean a1;
        boolean a2;
        
        a1 = (x1||x2)?true:false;
        a2 = (x3||x4)?true:false;
        
        answer = a1&&a2;
        return answer;
    }
}