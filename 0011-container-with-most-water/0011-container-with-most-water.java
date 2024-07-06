class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int left = 0; 
        int right = n-1;
        int max = 0;

        while(left < right){
            int lh = height[left];
            int rh = height[right];
            int h = Math.min(lh,rh);
            int width = right - left;
            int area = h * width;
            max = Math.max(max,area);

            if(lh < rh){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }
}