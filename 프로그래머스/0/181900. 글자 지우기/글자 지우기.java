import java.util.Arrays;

class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder sb = new StringBuilder(my_string);
        
        // 인덱스 배열을 내림차순으로 정렬하여, 뒤에서부터 제거할 문자를 처리
        Arrays.sort(indices);
        for (int i = indices.length - 1; i >= 0; i--) {
            int index = indices[i];
            sb.deleteCharAt(index);
        }
        
        return sb.toString();
    }
}