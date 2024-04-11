class Solution {
    
    public int Sum(int arr[]) {
        
        int result =0;
        for(int i=0; i<arr.length; i++)
        {
            result +=arr[i];
        }
        
        return result;
    }
    
    public int solution(int[] arr1, int[] arr2) {

        int len1 = arr1.length;
        int len2 = arr2.length;
        int answer = 0;
        
        if(len1!=len2)
        {
            answer = (len1>len2)?1:-1;
        }
        else
        {
            int sum1 = Sum(arr1);
            int sum2 = Sum(arr2);
            
            if(sum1==sum2)
            {
                return 0;
            }
            else
            {
                answer = (sum1>sum2)?1:-1;
            }
            
        }
        return answer;
    }
}