import java.util.*;
public class infix_to_postfix {
    static int precedence(char c){
        if(c == '+' || c == '-') return 1;
        if(c == '*' || c == '/') return 2;
        if(c == '^') return 3;
        return -1;
    }
    public static void main(String[] args) {
        String infix = "A*(B+C)/D";
        Stack<Character> stack = new Stack<>();
        String result = "";
        for(int i = 0; i < infix.length(); i++) {
            char c = infix.charAt(i);
            if(Character.isLetterOrDigit(c)) {
                result += c;
            }
            else if(c == '(') {
                stack.push(c);
            }
            else if(c == ')') {
                while(!stack.isEmpty() && stack.peek() != '(') {
                    result += stack.pop();
                }
                stack.pop();
            }
            else {
                while(!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    result += stack.pop();
                }
                stack.push(c);
            }
        }
        while(!stack.isEmpty()) {
            result += stack.pop();
        }
        System.out.println("Postfix expression: " + result);
    }
}