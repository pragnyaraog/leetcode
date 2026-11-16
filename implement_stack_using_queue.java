import java.util.*;
public class implement_stack_using_queue {
     Queue<Integer> q = new java.util.LinkedList<Integer>();
    public void push(int x){
        int s=q.size();
        q.add(x);
        for(int i=0;i<s;i++){
            q.add(q.poll());
        }
    }
    public int pop(){
        if(q.isEmpty()){
            System.out.println("Stack underflow");
            return -1;
        }
        return q.poll();
    }
    public int peek(){
        if(q.isEmpty()){
            System.out.println("Stack underflow");
            return -1;
        }
        return q.peek();
    }
    public boolean isEmpty(){
        return q.isEmpty();
    }
    public static void main(String[] args) {
        implement_stack_using_queue s=new implement_stack_using_queue();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.isEmpty());
    }
}
