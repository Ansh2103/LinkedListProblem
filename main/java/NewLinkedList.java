public class NewLinkedList {

    public Node last;
    public Node start;

    public NewLinkedList() {
            this.start = null;
            this.last = null;
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
