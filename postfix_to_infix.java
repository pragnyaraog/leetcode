import java.util.Scanner;
import java.util.Stack;

public class postfix_to_infix {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String postfix=sc.nextLine();
        Stack<String> stack=new Stack<>();
        for(int i=0;i<postfix.length();i++){
            char c=postfix.charAt(i);
            if(c=='+'||c=='-'||c=='*'||c=='/'){
                String op2=stack.pop();
                String op1=stack.pop();
                stack.push("("+op1+c+op2+")");
            }
            else{
                stack.push(Character.toString(c));
            }
        }
        System.out.println(stack.pop());
    }
}
