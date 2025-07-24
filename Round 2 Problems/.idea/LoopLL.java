public class LoopLL {
    Node head;

    static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    public boolean detectLoop() {
        Node slow = head;
        Node fast = head;

        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;  // Loop detected
            }
        }
        return false;  // No loop
    }

    public static void main(String[] args) {
        LoopLL list = new LoopLL();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = list.head.next;  // Create loop for test

        if (list.detectLoop()) {
            System.out.println("Loop found");
        } else {
            System.out.println("No loop");
        }
    }
}
