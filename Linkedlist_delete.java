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
    void deleteAtstart(){
        if(head==null){
            System.out.println("List is empty");
        }
        else{
            head=head.next;
        }
    }
    void deleteAtEnd(){
        if(head==null){
            System.out.println("empty");
        }
        else if(head.next==null){
            head=null;
        }
        else{
            Node n=head;
            while(n.next.next!=null){
                n=n.next;
            }
            n.next=null;
        }
    }
    void deleteAtindex(int index){
        if(index==0){
            deleteAtstart();
        }
        else{
            Node n =head;
            for(int i=0;i<index-1;i++){
                n=n.next;
            }
            n.next=n.next.next;

        }
    }
}

class Linkedlist_delete{
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
        ll.insert(40);
        ll.deleteAtindex(1);
        ll.deleteAtstart();
        ll.deleteAtEnd();
        Node n=ll.head;
        while(n!=null){
            System.out.println(n.data);
            n=n.next;
        }
    }
}