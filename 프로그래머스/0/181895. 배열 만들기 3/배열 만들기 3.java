import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        
        int a1 = intervals[0][0];
        int b1 = intervals[0][1];
        int a2 = intervals[1][0];
        int b2 = intervals[1][1];
        
        int arr1[] = Arrays.copyOfRange(arr,a1,b1+1);
        int arr2[] = Arrays.copyOfRange(arr,a2,b2+1);
        
        int answer[] = new int[arr1.length+arr2.length];
        int idx=0;
        
        for(int n : arr1)
        {
            answer[idx++] = n;
        }
        
        for(int n : arr2)
        {
            answer[idx++] = n;
        }
        
        return answer;
    }
}