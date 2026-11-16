class Node{
    int data;
    Node next;
}
 class LinkedList {
    Node head;
     void insert(int data){
        Node node=new Node();
        node.data=data;
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
    void insertAtStart(int data){
        Node node=new Node();
        node.data=data;
        node.next=head;
        head=node;
    }
    void inserAtIndex(int index,int data){
       Node node=new Node();
        node.data=data;
        Node n=head;
        if(index==0){
            insertAtStart(data);
        }
        else{
        for(int i=0;i<index-1;i++){
            n=n.next;
        }
        node.next=n.next;
        n.next=node;}
    }
    void deleteAt(int index){
        if(index==0){
            head=head.next;
        }
        else{
            Node n=head;
            for(int i=0;i<index-1;i++){
                n=n.next;
            }
            Node n1=null;
            n1=n.next;
            n.next=n1.next;
            // System.out.println(n1.data+" deleted");
        }
    }
    void length(){
        Node node=head;
        int count=0;
        while(node!=null){
            node=node.next;
            count++;
        }
        System.out.println("Length is "+count);
    }
    void search(int key){
        Node node=head;
        while(node!=null){
            if(node.data==key){
                System.out.println("found");
                return;
            }

            node=node.next;
        }
        System.out.println("not found");

    }
    public void show(){
        Node node=head;
        while(node!=null){
            System.out.println(node.data);
            node=node.next;
        }
    }
}
public class insertll{
    public static void main(String[] args){
       LinkedList list=new LinkedList();
       list.insert(5);
         list.insert(10);
            list.insert(15);
            list.insertAtStart(1);
            list.inserAtIndex(0,7);
            list.deleteAt(0);
            list.length();
            list.search(5);
            list.show();
    }
}
