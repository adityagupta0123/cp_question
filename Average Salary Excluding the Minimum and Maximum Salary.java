class Solution {
    public double average(int[] arr) {
        int min =arr[0], max=0;
        double sum =0;
        for(int i=0; i<arr.length; i++){
            max = Math.max(arr[i],max);
            min = Math.min(arr[i],min);
            sum += arr[i];
        }
        // System.out.print(max+" "+min+"  "+sum+"  "+arr.length);
        return (sum - max - min)/(arr.length - 2);        
    }
}
