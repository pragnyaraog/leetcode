class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
class LinkedList {
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
     }
    }
    void insertAtstart(int data){
        Node node=new Node(data);
        if(head==null){
            head=node;}
            else{
                node.next=head;
                node.prev=null;
                head.prev=node;
                head=node;
            }
        }
        void insertAtIndex(int index,int data){
            Node node=new Node(data);
            if(index==0){
                insertAtstart(data);
            }
            else{
                Node n=head;
                for(int i=0;i<index-1;i++){
                    n=n.next;
                }
                node.next=n.next;
                node.prev=n;
                n.next=node;
                node.next.prev=node;
            }
        }
        void deleteAt(int index){
            if(index==0){
                head=head.next;
                head.prev=null;
            }
            else{
                Node n=head;
                for(int i=0;i<index-1;i++){
                    n=n.next;
                }
                Node n1=n.next;
                n.next=n1.next;
                n1.next.prev=n;

            }
        }
        void reverse(){

           Node temp=null;
           Node curr=head;
           while(curr!=null){
              temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            curr = curr.prev;
           } 
           head=temp.prev;
        }
    void displayForward(){
        Node n=head;
        while(n!=null){
            System.out.print(n.data+" ");
            n=n.next;
        }
    } 
    void displayBackward(){
      Node n=head;
      if(n==null){
        return;
      }
      while(n.next!=null){
        n=n.next;
      }
        while(n!=null){
            System.out.print(n.data+" ");
            n=n.prev;
    }
}}
public class dllinsert{
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.insertAtEnd(10);
        list.insertAtEnd(9);
        list.insertAtEnd(8);
        list.insertAtstart(11);
        list.insertAtIndex(2, 15);
        list.deleteAt(3);
        list.reverse();
        list.displayForward();
        System.out.println();
        list.displayBackward();
    }
}
