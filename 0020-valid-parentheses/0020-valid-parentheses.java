class Solution {
 public static boolean isValid(String s) {
  Stack<Character> stack = new Stack<>();
    char[] chars = s.toCharArray();
    for(char c : chars){
      if(c == '(')
        stack.push(')');
      else if(c == '{')
        stack.push('}');
      else if(c == '[')
        stack.push(']');
      else if(stack.isEmpty() || stack.pop() != c)
        return false;
    }
    return stack.isEmpty();
  }
}