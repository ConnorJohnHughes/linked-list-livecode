public class Node {
    public char value;
    public Node next;
    public Node prev;

    public Node(char value, Node next, Node prev){
        this.value = value;
        this.next = next;
        this.prev = prev;
    }
}