

// TC: O(n); SC: O(n)
// Success
// Details
// Runtime: 2 ms, faster than 76.47% of Java online submissions for Two Sum.
// Memory Usage: 42.6 MB, less than 18.77% of Java online submissions for Two Sum.

import java.util.HashMap;
import java.util.Map;

// Solution 3
class Solution {
    public int[] twoSum(int[] nums, int target) {
        if (nums == null) {
            return null;
        }

        int len = nums.length;

        if (len == 0) {
            return new int[0];
        }

        Map<Integer, Integer> map = new HashMap<>();

        map.put(nums[0], 0);

        for (int i = 1; i < len; i++) {
            int diff = target - nums[i];
            Integer idx = map.get(diff);

            if (idx != null) {
                return new int[] {idx, i};
            }

            map.put(nums[i], i);
        }

        return null;
    }
}
// TC: O(n); SC: O(n)
// Success
// Details
// Runtime: 1 ms, faster than 99.80% of Java online submissions for Two Sum.
// Memory Usage: 42 MB, less than 64.89% of Java online submissions for Two Sum.
