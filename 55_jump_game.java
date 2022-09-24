class Solution {
    public boolean canJump(int[] nums) {
        // if( nums.length == 1)
        //     return true;
        // int max =0;
        // for(int i =0 ; i< nums.length - 1 && max >= i; i++ ){
        //     if( max < i + nums[i])
        //         max= i + nums[i];
        //     if(max >= nums.length - 1)
        //         return true;
        // }
        // return false;
        
        int goal = nums.length -1;
        for(int i =nums.length -1; i >= 0; i-- ){
            if( i + nums[i] >= goal)
                goal = i;
        }
        return goal == 0 ? true : false; 
        
    }
}
