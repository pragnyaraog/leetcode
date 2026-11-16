class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}   
class CircularLinkedList {
    Node head;

    CircularLinkedList() {
        head = null;
    }
    void deleteAtStart(){
        if(head==null){
            System.out.println("List is Empty");
        }
        else if(head.next==head){
            head=null;
        }
        else{
            Node n=head;
            while(n.next!=head){
                n=n.next;
            }
            head=head.next;
            n.next=head;
        }
/*   Node tail=head;
while(tail.next!=head){
    tail=tail.next;
}
tail.next=head;
 */
    }
    void deleteAtEnd(){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        else if(head.next==head){
            head=null;}
            else{
                Node n=head;
                while(n.next.next!=head){
                    n=n.next;
                }
                n.next=head;
            }
        }
        /*
Node tail=head;
while(tail.next.next!=head){
    tail=tail.next;
}tail.next=head;
         */
        void deleteAtIndex(int index){
            if(index==0){
                deleteAtStart();
            }
            else{
                Node n=head;
                for(int i=0;i<index-1;i++){
                    n=n.next;
                }
                Node n1=n.next;
                n.next=n1.next;
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
        void show(){
            if(head==null){
                System.out.println("List is Empty");
                return;
            }
            Node n=head;
            do{
                System.out.print(n.data+" ");
                n=n.next;
            }while(n!=head);
        }

    }

class Circularlinkedlist_delete {
        public static void main(String[] args){
            CircularLinkedList cll=new CircularLinkedList();
            cll.insert(10);
            cll.insert(20);
            cll.insert(30);
            cll.insert(0);
            cll.insert(40);
            cll.deleteAtStart();
            cll.deleteAtEnd();
            cll.deleteAtIndex(2);
            cll.show();
        }
}
