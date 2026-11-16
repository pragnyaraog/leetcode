package trees;
import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
    }
}
public class implementation_user_input {
    static Node build(){
        Scanner sc=new Scanner(System.in);
        int data=sc.nextInt();
        if(data==-1){
            return null;
        }
        Node root=new Node(data);
        Queue<Node> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            Node curr=q.poll();
            int l=sc.nextInt();
            if(l!=-1){
                curr.left=new Node(l);
                q.offer(curr.left);
            }
            int r=sc.nextInt();
             if(r!=-1){
                curr.right=new Node(r);
                q.offer(curr.right);
            }
        }
        return root;
    }
    static void inorder(Node root){
        if(root==null) return;
        Stack<Node> st=new Stack<>();
        Node curr=root;
        while(curr!=null&&!st.isEmpty()){
            while(curr!=null){
                st.push(curr);
                curr=curr.left;
            }
            curr=st.pop();
            System.out.println(curr.data);
            curr=curr.right;
        }
    }
    static void preorder(Node root){
        if(root==null) return;
        Stack<Node> st=new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            Node curr=st.pop();
            System.out.println(curr.data);
            if(curr.right!=null){
                st.push(curr.right);
            }
            if(curr.left!=null){
                st.push(curr.left);
            }
        }
    }
    static void postorder(Node root){
        if(root==null) return;
        Stack<Node> st1=new Stack<>();
        Stack<Node> st2=new Stack<>();
        st1.push(root);
        while(!st1.isEmpty()){
            Node curr=st1.pop();
            st2.push(curr);
            if(curr.left!=null){
                st1.push(curr.left);
            }
            if(curr.right!=null){
                st1.push(curr.right);
            }
        }
        while(!st2.isEmpty()){
            System.out.println(st2.pop().data);
        }
    }
    public static void main(String[] args){
        Node root=build();
    }
}
