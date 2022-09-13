class Solution {
    public int jump(int[] nums) {
//         int res = 0;
//         int left = 0, right = 0 ; // window or range 

        
//         while( right < nums.length -1 ){
//             int far = 0;
//             for(int i= left; i<= right ; i++)   
//                 //[2, (3,1) , (1,4 ) ]first l = 3 r = 1 than l = r+1  r =4(nums[i] + i)
//                 far = Math.max(far, nums[i]+ i);
            
//             left = right + 1;
//             right = far;
//             res++;
//         }
//         return res;
        
        int jumps = 0, curEnd = 0, curFarthest = 0;
	    for (int i = 0; i < nums.length - 1; i++) {
		    curFarthest = Math.max(curFarthest, i + nums[i]);
		    if (i == curEnd) {
		    	jumps++;
			    curEnd = curFarthest;
		      }
	     }
	     return jumps;
    }
}
