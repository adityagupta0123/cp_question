class Solution {
    int print2largest(int arr[], int n) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i=0; i< n ; i++){
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            } else if( arr[i] > secondMax && arr[i] != max)
            secondMax = arr[i];
        }
        return secondMax == Integer.MIN_VALUE ? -1 : secondMax ;
    }
}
