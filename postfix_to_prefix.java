import java.util.Stack;
public class postfix_to_prefix {
    public static void main(String[] args){
        String postfix="AB*CD-+";
        Stack<String> stack=new Stack<>();
        for(int i=0;i<postfix.length();i++){
            char c=postfix.charAt(i);
            if(c=='+'||c=='-'||c=='*'||c=='/'){
                String op2=stack.pop();
                String op1=stack.pop();
                stack.push(c+op1+op2);
            }
            else{
                stack.push(Character.toString(c));
            }
        }
        System.out.println(stack.pop());
    }
}
