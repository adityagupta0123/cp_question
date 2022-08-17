class Solution {
    public void sortColors(int[] nums) {
        int l = 0 , m = 0, r = nums.length -1;
        while (m <= r) {
           if( nums[m] == 0 ){ 
			  swap(nums, l, m);
               m++;
               l++;
           } else if( nums[m] == 2){
              swap(nums, r, m);
               r--;
            } else 
                m++;
            
        }            
    }
    public void swap(int[] nums, int i, int j) {
	   int temp = nums[i];
	   nums[i] = nums[j];
	   nums[j] = temp;
    }
}
