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
void deleteAtStart(){
if(head==null){
    System.out.println("List is Empty");
}
else if(head.next==null){
    head=null;
}
else{
    head=head.next;
    head.prev=null;
}
}
void deleteAtEnd(){

}
void deleteAt(int index){}

}
class Doublelinkedlist_delete{
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        l1.insert(10);
        l1.insert(20);
        ll.insert(30);
        ll.insert(40);
        ll.insert(50);
        ll.deleteAtStart();
        ll.deleteAtEnd();
        ll.deleteAt(2);
    }
}