class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
         if (coordinates.length == 2)
            return true;
         int f  = coordinates[1][1] - coordinates[0][1];
         int s =  coordinates[1][0] - coordinates[0][0];
        
        for(int i =2 ; i < coordinates.length ; i++ ) {
            if ( f * (coordinates [i][0] - coordinates[1][0] ) != 
                 s * (coordinates[i][1]  - coordinates[1][1] ))
                return false;
        }
        return true;
    }
}
