class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int pos = -1, cur = 0, total = 0;
        for(int i =0; i< gas.length ; i++){
            int diff = gas[i] - cost [i];
            cur += diff;
            total += diff;
            if ( cur < 0) {
                cur = 0;
                pos = i;
            }
        }
        if( total >= 0)
            return pos + 1;
     return -1;
    }
}
