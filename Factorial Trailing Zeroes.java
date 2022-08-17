class Solution {
    public int trailingZeroes(int n) {
        // no. of zero depends upon no. of 5
        int count =0;
        while ( n > 0){
            n /=5;
            count += n;
        }
        return count;
        
    }
}
