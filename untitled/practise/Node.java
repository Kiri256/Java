package practise;

public class Node {
        int val;
        Node left;
        Node next;
        Node right;
        Node() {}
        Node(int val) { this.val = val; }
        Node(int val, Node next) { this.val = val; this.next = next; }
}
