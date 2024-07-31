class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        result[n-1] = -1;
        
        int max_right = arr[n-1];
    
        for(int i = n-2 ; i >= 0 ; i--){
            result[i] = max_right;
            max_right = Math.max(max_right,arr[i]);
        }
        return result;
    }
}
