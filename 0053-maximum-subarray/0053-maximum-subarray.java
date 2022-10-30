class Solution {
    public int maxSubArray(int[] A) {
        int max_so_far = A[0];
        int max_ending_here = 0;
        int start = 0,end = 0, s=0;

        for(int i = 0 ; i < A.length; i++){
        max_ending_here = max_ending_here + A[i];
            if(max_so_far < max_ending_here){
                max_so_far = max_ending_here;
                start = s;
                end = i;
            }
            if(max_ending_here < 0){
                max_ending_here = 0;
                s = i+1;
            }
        }
        return max_so_far;
    }
}