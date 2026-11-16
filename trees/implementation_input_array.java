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
public class implementation_input_array {
     static Node build(int[] arr){
         if(arr.length==0){
            return null;
         }
         int n=arr.length;
         Node[] nodes=new Node[n];
         for(int i=0;i<n;i++){
            nodes[i]=new Node(arr[i]);
         }
         for(int i=0;i<n;i++){
            int l=2*i+1;
            int r=2*i+2;
            if(l<n){
                nodes[i].left=nodes[l];
            }
            if(r<n){
                nodes[i].right=nodes[r];
            }
         }
          return nodes[0];
    }
    static void inorder(Node root){
        if(root==null) return;
     inorder(root.left);
     System.out.println(root.data);
     inorder(root.right);
    }
     static void preorder(Node root){
        if(root==null) return;
        System.out.println(root.data);
     preorder(root.left);
     preorder(root.right);
    }
    static void postorder(Node root){
        if(root==null) return;
     postorder(root.left);
     postorder(root.right);
     System.out.println(root.data);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
          a[i]=sc.nextInt();
        }
        Node root=build(a);
        inorder(root);
        preorder(root);
        postorder(root);
    }
}
