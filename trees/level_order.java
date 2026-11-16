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
public class level_order {
    static Node build(int[] arr){
      if(arr.length==0) return null;
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
    public List<List<Integer>> level_order(Node root){
        List<List<Integer>> l=new LinkedList<List<Integer>>();
        Queue<Node> q=new LinkedList<Node>();
        if(root==null) return null;
        q.offer(root);
        while(!q.isEmpty()){
            int ln=q.size();
            List<Integer> s=new LinkedList<>();
        for(int i=0;i<ln;i++){
            Node curr=q.poll();
            s.add(curr.data);
             if(curr.left!=null) q.offer(curr.left);
             if(curr.right!=null) q.offer(curr.right);
        }
        l.add(s);
    }
    return l;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Node root=build(arr);
        level_order obj = new level_order();

        List<List<Integer>> ans = obj.level_order(root);

        System.out.println(ans);
    }
}
