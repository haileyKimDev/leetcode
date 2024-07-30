class Solution {
   public static boolean checkIfExist(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        
        for (int num : arr) {
            // Check if double or half of the number is already in the set
            if (set.contains(2 * num) || (num % 2 == 0 && set.contains(num / 2))) {
                return true;
            }
            // Add the number to the set
            set.add(num);
        }
        
        return false;
    }

}