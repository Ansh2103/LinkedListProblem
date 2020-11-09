public class NewLinkedList {

    public Node last;
    public Node start;

    public NewLinkedList() {
            this.start = null;
            this.last = null;
        }

    public void addAtStart(Node newFirstNode) {
        if(last == null) {
            last = newFirstNode;
        }
        if(start == null){
            start = newFirstNode;
        }
        else{
            this.last.setNext(newFirstNode);
            this.last = newFirstNode;
        }
    }

    public void addAtLast(Node myNode) {
        if(last == null) {
            last = myNode;
        }
        if(start == null){
            start = myNode;
        }
        else {
            Node temp = start;
            this.start = myNode;
            this.start.setNext(temp);
        }
    }
    }
