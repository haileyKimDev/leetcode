class Solution {
 public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums); // 정렬
        Set<List<Integer>> answer = new HashSet<>();
        int target = 0;
        int n = nums.length;
        for (int i = 0; i < n - 2; i++) {
            int low = i + 1;
            int high = n - 1;
            while (low < high) {
                int sum = nums[i] + nums[low] + nums[high];
                if (sum == target) {
                    answer.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    low++;
                    high--;
                } else if (sum < target) {
                    low++;
                } else {
                    high--;
                }
            }
        }
        return new ArrayList<>(answer);
    }
}