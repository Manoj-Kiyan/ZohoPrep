public class MiddleElementLL {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }

        @Override
        public String toString() {
            return "Node(" + data + ")";
        }
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public int getMid() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp + " -> "); // uses toString()
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        MiddleElementLL list = new MiddleElementLL();

        // ✅ use add() to insert elements
        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }

        list.printList(); // optional: prints entire list

        int middle = list.getMid();
        System.out.println("Middle element is: " + middle);
    }
}
