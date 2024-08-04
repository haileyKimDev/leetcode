class Solution {
    public void moveZeroes(int[] nums) {
        int nonZero = 0 ; 
        for(int i = 0 ; i < nums.length; i++){
            if(nums[i]!=0){
                nums[nonZero++] = nums[i];
            }
        }
        for(int i = 1 ; i < nonZero; i++){
            nums[nums.length-i] = 0;
        }
    }
}