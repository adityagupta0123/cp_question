class Solution {
    // public int numSubarrayProductLessThanK(int[] nums, int k) {
        // int len = nums.length;
        // if( len <= 1)
        //     return 0;
        // int count = 0;
        // for(int i=0; i<len; i++){
        //     int prod = nums[i];
        //     if( prod < k)
        //         count++;
        //     for(int j = i + 1; j< len && prod< k; j++){
        //         prod = prod * nums[j];
        //         if( prod < k)
        //             count++;    
        //     }
        // } 
        // return count;
    // }
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if( k <= 1){
            return 0;
        }// nums[0] = [1] , k =1
        int count = 0, left = 0, prod = 1;
        for(int r=0; r< nums.length; r++){
            prod *= nums[r];
            while( prod >= k)
                prod /= nums[left++];
            count += r - left + 1; 
        }
        return count;
    }
}
