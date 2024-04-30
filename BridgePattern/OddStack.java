package BridgePattern;

public class OddStack extends AbstractStack {
    public OddStack(StackImpl stackImpl) {
        super(stackImpl);
    }

    @Override
    public void push(int element) {
        if (element % 2 != 0) {
            super.push(element);
        }
    }
}
