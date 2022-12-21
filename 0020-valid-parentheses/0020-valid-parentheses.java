  
// Solution
class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        
        for (int i = 0; i < s.length(); i++) {
            char paren = s.charAt(i);
            
            if (paren == '{' || paren == '[' || paren == '(') {
                stack.offerFirst(paren);
            }
            else {
                if (paren == '}') {
                    if (stack.isEmpty() || stack.pollFirst() != '{') {
                        return false;
                    }
                }
                else if (paren == ']') {
                    if (stack.isEmpty() || stack.pollFirst() != '[') {
                        return false;
                    }
                }
                else {
                    if (stack.isEmpty() || stack.pollFirst() != '(') {
                        return false;
                    }
                }
            }
        }
        
        if (!stack.isEmpty()) {
            return false;
        }
        
        return true;
    }
}