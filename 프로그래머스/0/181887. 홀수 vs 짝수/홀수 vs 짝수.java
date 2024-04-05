class Solution {
    public int solution(int[] num_list) {
        int odd_sum = 0;
        int even_sum = 0;
        
        for(int i=0; i<num_list.length; i++){
            if(i%2==0)
            {
                odd_sum+= num_list[i];
            }
            else
            {
                even_sum+=num_list[i];
            }
        }
        
       if(odd_sum>even_sum)
       {
           return odd_sum;
       }
       else if(even_sum>odd_sum)
       {
           return even_sum;
       }
       else
       {
           return even_sum;
       }
            
    }
}