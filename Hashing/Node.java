public class Node {
    public Object data;
    public Node next;

    public Node() { this(null); }

    public Node(Object data){
        this.data = data;
        this.next = null;
    }
}
