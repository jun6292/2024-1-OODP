package AdapterPattern1;

// Adapter Pattern 위임
public class PrintBannerDel implements Print {
    private Banner banner;
    public PrintBannerDel(String string) {
        this.banner = new Banner(string);
    }
    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }

    public static void main(String[] args) {
        Print p = new PrintBannerDel("Hello");
        p.printWeak();
        p.printStrong();
    }
}
