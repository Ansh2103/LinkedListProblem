public class Node<T> {
    private Node next;
    private T key;

    public Node(T key) {
        this.key = null;
        this.next = null;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

}
