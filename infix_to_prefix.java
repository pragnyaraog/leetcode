import java.util.Stack;
public class infix_to_prefix {
    static int precedence(char c){
        if(c=='+'||c=='-'){
            return 1;
        }
        if(c=='*'||c=='/'){
            return 2;
        }
        if(c=='^'){
            return 3;
        }
        return -1;
    }
    public static void main(String[] args){
        String infix="A*(B+C)/D";
        StringBuilder sb=new StringBuilder(infix);
        sb.reverse();
        infix=sb.toString();
        Stack<Character> stack=new Stack<>();
        String result="";
        for(int i=0;i<infix.length();i++){
            char c=infix.charAt(i);
            if (c == '(') c = ')';
            else if (c == ')') c = '(';
            if(Character.isLetterOrDigit(c)){
                result+=c;
            }
            else if(c=='('){
                stack.push(c);
            }
            else if(c==')'){
                while(stack.isEmpty()==false&&stack.peek()!='('){
                    result+=stack.pop();
                }
                stack.pop();
            }
            else{
                while(!stack.isEmpty()&&precedence(c)<precedence(stack.peek())){
                    result+=stack.pop();
                }
                stack.push(c);
            }
        }
        while(!stack.isEmpty()){
            result+=stack.pop();
        }
        StringBuilder prefix=new StringBuilder(result);
        prefix.reverse();
        System.out.println("Prefix expression: " + prefix);
    }
}
