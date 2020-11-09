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
    public void provideThreeNumber_WhenAddedToStart_ShouldReturnTrue() {
        Node<Integer> firstNode = new Node<>(56);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(70);
        NewLinkedList myCreatedLinkList = new NewLinkedList();
        myCreatedLinkList.addAtStart(firstNode);
        myCreatedLinkList.addAtStart(secondNode);
        myCreatedLinkList.addAtStart(thirdNode);


        boolean isLinkedListCreated = myCreatedLinkList.start.equals(firstNode) &&
                myCreatedLinkList.start.getNext().equals(secondNode) &&
                myCreatedLinkList.last.equals(thirdNode);
        Assert.assertTrue(isLinkedListCreated);
    }
}
