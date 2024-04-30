package BridgePattern;

public interface Stack {
    void push(int element);
    Integer pop();
    Integer top();
    boolean isEmpty();
    boolean isFull();
    void printStack();
}
