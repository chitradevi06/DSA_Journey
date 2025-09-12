import java.util.Stack;

class Solution {
    public String infixToPost(String s) {
        Stack<Character> stack = new Stack<>();
        String ans = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                ans += ch;
            }
           
            else if (ch == '(') {
                stack.push(ch);
            }
            else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    ans += stack.pop();
                }
                stack.pop(); 
            }
           
            else {
                while (!stack.isEmpty() && priority(ch) <= priority(stack.peek())) {
                    ans += stack.pop();
                }
                stack.push(ch);
            }
        }
        while (!stack.isEmpty()) {
            ans += stack.pop();
        }

        return ans;
    }
    public int priority(char p) {
        if (p == '^') return 3;
        else if (p == '*' || p == '/') return 2;
        else if (p == '+' || p == '-') return 1;
        else return -1;
    }

    public static void main(String args[]) {
        String str = "a+b*(c^d-e)";
        Solution obj = new Solution();
        System.out.println("Postfix: " + obj.infixToPost(str));
    }
}
