class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class LinkedList{
    Node head;
    LinkedList(){
        head=null;
    }
void insertAtStart(int data){
        Node node=new Node(data);
        node.next=head;
        head=node;
    }
    void insert(int data){
        Node node=new Node(data);
        node.next=null;
        if(head==null){
            head=node;
        }
        else{
            Node n=head;
            while(n.next!=null){
                n=n.next;
            }
            n.next=node;
        }

    }
    void insertAtEnd(int data){
        Node node =new Node(data);
        node.next=null;
        if(head==null){
            head=node;
        }
        else{
            Node n=head;
            while(n.next!=null){
                n=n.next;
            }
            n.next=node;
        }
    }
    void insertAtIndex(int data,int index){
        Node node=new Node(data);
        Node n=head;
        for(int i=0;i<index-1;i++){
            n=n.next;
        }
        node.next=n.next;
        n.next=node;
    }
}
    class Linkedlist_insertstart{
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
        ll.insertAtStart(5);
        ll.insertAtEnd(1);
        ll.insertAtIndex(15, 2);
        Node n=ll.head;
        while(n!=null){
            System.out.println(n.data);
            n=n.next;
        }
    }
}