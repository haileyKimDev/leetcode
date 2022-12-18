class Solution {
    public boolean isAnagram(String s, String t) {
        int[] alphabet = new int[26];
        //count frequency of each character in given string s
        //store the frequency of each character at a particular index in the array
        for (int i = 0; i < s.length(); i++) alphabet[s.charAt(i) - 'a']++;
        for (int i = 0; i < t.length(); i++) alphabet[t.charAt(i) - 'a']--;
        for (int i : alphabet) if (i != 0) return false;
        return true;
    }
}