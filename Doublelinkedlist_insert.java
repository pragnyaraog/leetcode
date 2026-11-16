class Node{
    int data;
    Node next;
    Node prev;

    public Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
class LinkedList{
Node head;
void insertAtEnd(int data){
    Node node=new Node(data);
    if(head==null){
        head=node;
    }
    else{
        Node n=head;
        while(n.next!=null){
            n=n.next;
        }
        n.next=node;
        node.prev=n;
        node.next=null;
    }
}
void insertAtStart(int data){
    Node node=new Node(data);
    if(head==null){
        head=node;
    }
    else{
        node.prev=null;
        node.next=head;
        head.prev=node;
        head=node;
    }
}
void insertAtIndex(int index,int data){
    Node node=new Node(data);
    if(index==0){
        insertAtStart(data);
    }
    else{
        Node n=head;
        for(int i=0;i<index-1;i++){
            n=n.next;
        }
        node.next=n.next;
        node.prev=n;
        n.next=node;
        if(node.next!=null){
            node.next.prev=node;
        }
    }
}
void displayForward(){
    Node n=head;
    while(n!=null){
        System.out.print(n.data+" ");
        n=n.next;
    }
    System.out.println();
}}
class Doublelinkedlist_insert{
public static void main(String[] args) {
    LinkedList dll=new LinkedList();
    dll.insertAtEnd(10);
    dll.insertAtEnd(20);
    dll.insertAtEnd(30);
    dll.insertAtStart(5);
    dll.insertAtIndex(2, 15);
    dll.displayForward();
}
}