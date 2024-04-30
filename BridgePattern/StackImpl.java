package BridgePattern;

public interface StackImpl {
    void push(int element);
    Integer pop();
    Integer top();
    boolean isEmpty();
    boolean isFull();
}
