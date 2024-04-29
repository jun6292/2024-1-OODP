package AdapterPattern1;

// Adapter Pattern 상속
public class PrintBannerExt extends Banner implements Print {
    public PrintBannerExt(String string) {
        super(string);
    }

    @Override
    public void printStrong() {
        showWithAster();
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    public static void main(String[] args) {
        Print p = new PrintBannerExt("Hello");
        p.printWeak();
        p.printStrong();
    }
}
