package BridgePattern;

public class AbstractStack implements Stack {
    protected StackImpl stackImpl;
    public AbstractStack(StackImpl stackImpl) {
        this.stackImpl = stackImpl;
    }

    @Override
    public void push(int element) {
        stackImpl.push(element);
    }

    @Override
    public Integer pop() {
        return stackImpl.pop();
    }

    @Override
    public Integer top() {
        return stackImpl.top();
    }

    @Override
    public boolean isEmpty() {
        return stackImpl.isEmpty();
    }

    @Override
    public boolean isFull() {
        return stackImpl.isFull();
    }

    @Override
    public void printStack() {

    }
}
