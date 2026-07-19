class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (temp == '(' || temp == '{' || temp == '[')
                stack.push(s.charAt(i));
            else {
                if(stack.isEmpty())
                    return false;
                if (temp == ')' && stack.peek() == '(')
                    stack.pop();
                else if (temp == ']' && stack.peek() == '[')
                    stack.pop();
                else if (temp == '}' && stack.peek() == '{')
                    stack.pop();
                else return false;
            }
        }
        return stack.isEmpty();
    }
}
