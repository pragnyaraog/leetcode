class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
class CircularLinkedList{
    Node head;
    CircularLinkedList(){
        head=null;
    }
    void insertAtStart(int data){
        Node node = new Node(data);
        if(head==null){
            head=node;
            node.next=head;
        }
        else{
            Node n=head;
            while(n.next!=head){
                n=n.next;
            }
            node.next=head;
            head=node;
            n.next=head;
        }
    }
    void insert(int data){
        Node node=new Node(data);
        if(head==null){
            head=node;
            node.next=head;
        }
        else{
            Node n=head;
            while(n.next!=head){
                n=n.next;
            }
            n.next=node;
            node.next=head;
        }
    }
    void insertAtEnd(int data){
        Node node=new Node(data);
        if(head==null){
            head=node;
            node.next=head;
        }
        else{
            Node n=head;
            while(n.next!=head){
                n=n.next;
            }
            n.next=node;
            node.next=head;
/*
Node tail=head;
while(tail.next!=head){
    tail=tail.next;
}
tail.next=node;
node.next=head;
 */
        }
    }
    void insertAtIndex(int data,int index){
        Node node = new Node(data);
        if(index==0){
            insertAtStart(data);
            return;
        }
        else{
            Node n=head;
            for(int i=0;i<index-1;i++){
                n=n.next;
            }
            node.next=n.next;
            n.next=node;
        }
        /* Node tail=head;
for(int i=0;i<index-1;i++){
    tail=tail.next;
}
node.next=tail.next;
tail.next=node;
         */
    }
    void show(){
        Node node=head;
        if(head!=null){
           while(node.next!=head){
                System.out.print(node.data+" ");
                node=node.next;
            }
            System.out.print(node.data);
    }
    }
}
public class Circularlinkedlist_insert {
    public static void main(String[] args) {
        CircularLinkedList cll=new CircularLinkedList();
        cll.insert(5);
        cll.insert(10);
        cll.insert(15);
        cll.insertAtStart(1);
        cll.insertAtEnd(20);
        cll.insertAtIndex(12, 2);
        cll.show();
    }
}
