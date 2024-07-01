class Solution {
    public boolean isPalindrome(String s) {
       String noSpaces = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int start = 0 ;
        int end = noSpaces.length()-1;
        while(start <= end){
            char startChar = noSpaces.charAt(start);
            char endChar = noSpaces.charAt(end);
            if(startChar != endChar){
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}