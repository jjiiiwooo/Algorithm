import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int len = 1;
        
        //len이 arr 배열의 길이보다 작은 동안에, len을 2배 증가
        while(len <arr.length)
        {
            len*=2;
        }
        
        return Arrays.copyOf(arr,len);
        
    }
}