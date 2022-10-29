class Solution {
        // time complexity : for double loop -> O(n^2)
        // space complexity : no extra space allocated -> O(1)
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                return new int[]{map.get(nums[i]), i};
            }
            map.put(target - nums[i], i);
        }

        return new int[]{};
    }
    
        public static void main(String[] args) {
            int[] nums = {1, 4, 7, 8};
            int target = 11;

            Solution t = new Solution();
            System.out.println(Arrays.toString(t.twoSum(nums, target)));
        }
}