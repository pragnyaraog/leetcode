public class implement_stack_using_array {
    int[] stack;
    int capacity;
    int top;
    public implement_stack_using_array(int size){
       capacity=size;
         stack=new int[capacity];
         top=-1;
    }
   public void push(int x){
    if(top>=capacity-1){
        System.out.println("stack overflow");
        return;
    }
    stack[++top]=x;
   }
   public int pop(){
    if(isEmpty()){
        System.out.println("stack underflow");
        return -1;
    }
    return stack[top--];
   }
   public int top(){
    if(isEmpty()){
        System.out.println("stack is empty");
        return -1;
    }
    return stack[top];
   }
   public boolean isEmpty(){
    return top==-1;
   }
   public void display(){
    for(int i=top;i>=0;i--){
        System.out.println(stack[i]);
    }
   }
   public static void main(String[] args){
    implement_stack_using_array s=new implement_stack_using_array(5);
    s.push(4);
    s.push(5);
    s.push(6);
    s.display();
    System.out.println(s.pop());
    System.out.println(s.top());
   }
}
