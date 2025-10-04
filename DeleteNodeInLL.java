import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

public class DeleteNodeInLL {
    ListNode head;

    public void insertAtEnd(int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public void deleteNode(int key) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.val == key) {
            System.out.println("Deleted: " + key);
            head = head.next;
            return;
        }
        ListNode temp = head;
        while (temp.next != null && temp.next.val != key) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Node " + key + " not found");
        } else {
            System.out.println("Deleted: " + key);
            temp.next = temp.next.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DeleteNodeInLL list = new DeleteNodeInLL();

        while (true) {
            System.out.println("\n1. Insert Node");
            System.out.println("2. Display List");
            System.out.println("3. Delete Node by Value");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    list.insertAtEnd(sc.nextInt());
                    break;
                case 2:
                    list.display();
                    break;
                case 3:
                    System.out.print("Enter value to delete: ");
                    list.deleteNode(sc.nextInt());
                    break;
                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
