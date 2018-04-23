/**
 * @Original author Jay: java code for node for singly-linked list (next->next->) 
 * The-Coding-Delight/Java/Linked-list/Node.java
 *
 * modified and extended by alphaveneno 2018_04_23 as a doubly-linked node
 * to work with DoublyLinkedList.java
 */
public class Node<T extends Comparable<T>> {

    // The data
    private T data;
    // Pointer to the next node
    private Node<T> nextNode;
    private Node<T> prevNode;//added by alphaveneno

    public Node(T data) {
        this.data = data;
    }

    /*
     * =====================================
     * ======== Getters and Setters ========
     * =====================================
     * */
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNext() {
        return nextNode;
    }
    
    public Node<T> getPrev() {//added by alphaveneno
        return prevNode;
    }

    public void setNext(Node<T> nextNode) {//modified by alphaveneno
        this.nextNode = nextNode;
    }
    
    public void setPrev(Node<T> prevNode) {//modified and added by alphaveneno
        this.prevNode = prevNode;
    }

    // In most cases it is recommended to override the toString() method
    // so that the data will be converted into a string format
    // that is meaningful to the user
    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}
