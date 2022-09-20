class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        char ch1[] = text1.toCharArray();
        char ch2[] = text2.toCharArray();
        int temp[][] = new int[ch1.length + 1][ch2.length + 1];
        int max = 0;
        for(int i = 1; i< temp.length; i++){
            for(int j=1; j< temp[0].length; j++){
                if(ch1[i-1] == ch2[j-1] )
                    temp [i][j] = temp[i-1][j-1] + 1;
                 else
                    temp [i][j] = Math.max(temp[i][j-1], temp[i-1][j]);
                
                if(temp[i][j] > max)
                    max = temp[i][j];
            }
        }
        return max;
    }
}
