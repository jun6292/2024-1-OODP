package BridgePattern;

public class EvenStack extends AbstractStack {
    public EvenStack(StackImpl stackImpl) {
        super(stackImpl);
    }

    @Override
    public void push(int element) {
        if (element % 2 == 0) {
            super.push(element);
        }
    }
}
