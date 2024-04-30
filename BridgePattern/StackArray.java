package BridgePattern;

public class StackArray implements StackImpl {
    private int[] items;
    private int top;
    private final int maxSize;

    public StackArray(int size) {
        this.maxSize = size;
        this.items = new int[size];
        this.top = -1;
    }

    @Override
    public void push(int element) {
        if (!isFull()) {
            items[++top] = element;
        }
    }

    @Override
    public Integer pop() {
        return isEmpty() ? null : items[top--];
    }

    @Override
    public Integer top() {
        return isEmpty() ? null : items[top];
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public boolean isFull() {
        return top == maxSize - 1;
    }
}
