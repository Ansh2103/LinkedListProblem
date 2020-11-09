import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {
    @Test
    public void provideThreeNumber_WhenLinked_shouldTestCasePassed() {
        Node<Integer> firstNode = new Node<>(56);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(70);
        firstNode.setNext(secondNode);
        secondNode.setNext(thirdNode);
        boolean result = firstNode.getNext().equals(secondNode) &&
                secondNode.getNext().equals(thirdNode);

        Assert.assertTrue(result);
    }

    @Test
    public void provideThreeNumber_WhenAddedToTop_ShouldTestCasePassed() {
        Node<Integer> firstNode = new Node<>(30);
        Node<Integer> secondNode = new Node<>(56);
        Node<Integer> thirdNode = new Node<>(70);
        NewLinkedList myCreatedLinkList = new NewLinkedList();
        myCreatedLinkList.addAtLast(firstNode);
        myCreatedLinkList.addAtLast(secondNode);
        myCreatedLinkList.addAtLast(thirdNode);


        boolean isLinkedListCreated = myCreatedLinkList.start.equals(thirdNode) &&
                myCreatedLinkList.start.getNext().equals(secondNode) &&
                myCreatedLinkList.last.equals(firstNode);
        Assert.assertTrue(isLinkedListCreated);
    }
}
