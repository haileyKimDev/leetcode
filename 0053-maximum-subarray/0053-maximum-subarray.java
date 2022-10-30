class Solution {
    public int maxSubArray(int[] A) {
        int max_so_far = A[0]; //maximun sum
        int max_ending_here = 0; // 
        int start = 0; // first element of Maximum Subarray
        int end = 0;// last element of Maximum Subarray
        int s=0; // which indicate where Maximum Subarray can start

        for(int i = 0 ; i < A.length; i++){
        max_ending_here = max_ending_here + A[i];
            if(max_so_far < max_ending_here){ 
                // if current sum is greater than max so far
                max_so_far = max_ending_here;
                start = s;
                end = i;
            }
            if(max_ending_here < 0){
                // current sub array is no longer exists because the sum is negative
                max_ending_here = 0;
                s = i+1; // to find a new sub arrary 
            }
        }
        return max_so_far;
    }
}