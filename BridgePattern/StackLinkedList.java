package BridgePattern;

public class StackLinkedList implements StackImpl {
    private class Node {
        int value;
        Node next;
    }
    private Node top;
    private int size;

    @Override
    public void push(int element) {
        Node node = new Node();
        node.value = element;
        node.next = top;
        top = node;
        size++;
    }

    @Override
    public Integer pop() {
        if (isEmpty()) return null;
        int value = top.value;
        top = top.next;
        size--;
        return value;
    }

    @Override
    public Integer top() {
        return isEmpty() ? null : top.value;
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public boolean isFull() {
        return false;
    }
}
