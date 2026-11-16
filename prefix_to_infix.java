import java.util.Scanner;
import java.util.Stack;
public class prefix_to_infix {
 public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String prefix=sc.nextLine();
    Stack<String> stack=new Stack<>();
    for(int i=prefix.length()-1;i>=0;i--){
        char c=prefix.charAt(i);
        if(c=='+'||c=='-'||c=='*'||c=='/'){
            String op1=stack.pop();
            String op2=stack.pop();
            stack.push("("+op1+c+op2+")");
        }
        else{
            stack.push(Character.toString(c));
        }
    }
    System.out.println(stack.pop());
 }
}
