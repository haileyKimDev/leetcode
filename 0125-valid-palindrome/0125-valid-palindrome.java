class Solution {
    public boolean isPalindrome(String s) {
        String cleanedString = removeNonAlphanumeric(s);
        int start = 0;
        int end = cleanedString.length() - 1;
        
        while (start <= end) {
            char startChar = cleanedString.charAt(start);
            char endChar = cleanedString.charAt(end);
            if (startChar != endChar) {
                return false;
            }
            start++;
            end--;
        }
        
        return true;
    }

    public String removeNonAlphanumeric(String s) {
        StringBuilder str = new StringBuilder();
        char[] arr = s.toLowerCase().toCharArray();
        for (char c : arr) {
            if (Character.isLetterOrDigit(c)) {
                str.append(c);
            }
        }
        return str.toString();
    }
}
