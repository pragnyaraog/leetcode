import java.util.Stack;
class Node{
    int data;
    Node left;
    Node right;
    Node (int data){
        this.data=data;
    }
}
class PreOrderTree {
    static void preOrder(Node root){
        Stack<Node> s=new Stack<>();
        s.push(root);
        if(root==null){
            return;
        }
        /*System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);*/
        while(!s.isEmpty()){
            Node temp=s.pop();
            System.out.print(temp.data+" ");
            if(temp.right!=null){
                s.push(temp.right);
            }
            if(temp.left!=null){
                s.push(temp.left);
            }
        }
    }
public static void main(String[] args) {
    Node root=new Node(1);
    root.left=new Node(2);
    root.right=new Node(3);
    root.left.left=new Node(4);
    root.left.right=new Node(5);
    root.right.left=new Node(6);
    root.right.right=new Node(7);
    preOrder(root);
}}