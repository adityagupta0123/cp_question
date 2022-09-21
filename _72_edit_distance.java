class Solution {
    public int minDistance(String word1, String word2) {
        char ch1[] = word1.toCharArray();
        char ch2[] = word2.toCharArray();
        
        int temp[][] = new int [ch1.length + 1][ch2.length + 1];
        for(int i =0; i< temp[0].length; i++)
            temp[0][i] = i;
        for(int i =0; i< temp.length; i++)
            temp[i][0] = i;
        
        for(int i=1; i <= ch1.length; i++){
            for(int j=1; j<= ch2.length; j++){
                if(ch1[i-1] == ch2[j-1])
                    temp[i][j]= temp[i-1][j-1];
                else
                    temp[i][j] = 1 + Math.min(temp[i-1][j-1], Math.min(temp[i-1][j],temp[i][j-1]));
            }
        }
        return temp[ch1.length][ch2.length];
    }
}
