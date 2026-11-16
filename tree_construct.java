import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

public class tree_construct {

    static Node buildTree(Scanner sc) {
        int val = sc.nextInt();

        if (val == -1) {
            return null;
        }

        Node root = new Node(val);

        root.left = buildTree(sc);
        root.right = buildTree(sc);

        return root;
    }

    static void inorder(Node root) {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter tree nodes (-1 for null):");
        Node root = buildTree(sc);

        System.out.println("Inorder traversal:");
        inorder(root);
    }
}
