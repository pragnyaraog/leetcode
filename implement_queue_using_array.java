public class implement_queue_using_array {
    int[] queue;
    int capacity;
    int front;
    int rear;
    public implement_queue_using_array(int size){
        capacity=size;
        queue=new int[capacity];
        front=-1;
        rear=-1;
    }
    public void enqueue(int x){
        if(rear==capacity-1){
            System.out.println("queue overflow");
            return;
        }
        queue[++rear]=x;
    }
    public int dequeue(){
        if(front==rear){
            System.out.println("stack underflow");
            return -1;
        }
        return queue[++front];
    }
    public int peek(){
        if(front==rear){
            System.out.println("queue is empty");
            return -1;
        }
        return queue[front+1];
    }
    public boolean isEmpty(){
        return front==rear;
    }
    public void display(){
        if(front==rear){
            System.out.println("queue is empty");
            return;
        }
        for(int i=front+1;i<=rear;i++){
            System.out.println(queue[i]);
        }
    }
    public static void main(String[] args) {
        implement_queue_using_array q=new implement_queue_using_array(4);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);
        q.display();
        System.out.println(q.dequeue());
        System.out.println(q.peek());
    }
}
