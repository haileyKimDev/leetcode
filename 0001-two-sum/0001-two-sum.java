class Solution {
  public static int[] twoSum(int[] nums, int target) {
    HashMap<Integer,Integer> map = new HashMap<>();
    int[] answer = new int[2];
    for(int i=0; i < nums.length; i++){
      int i1 = target - nums[i];
      if(map.containsKey(i1)){
        answer[0] = map.get(i1);
        answer[1] = i;
      }
      map.put(nums[i],i);
    }
    return answer;
  }
}