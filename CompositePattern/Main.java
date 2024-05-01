package CompositePattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Making root entries...");
        Directory rootdir = new Directory("root");
        Directory bindir = new Directory("bin");
        Directory tmpdir = new Directory("tmp");
        Directory usrdir = new Directory("usr");
        rootdir.add(bindir);
        rootdir.add(tmpdir);
        rootdir.add(usrdir);
        bindir.add(new File("vi", 10000));
        bindir.add(new File("latex", 20000));
        rootdir.printList();
        System.out.println();

        System.out.println("Making user entries...");
        Directory emchoi = new Directory("emchoi");
        Directory gildong = new Directory("gildong");
        Directory dongguk = new Directory("dongguk");
        usrdir.add(emchoi);
        usrdir.add(gildong);
        usrdir.add(dongguk);
        emchoi.add(new File("diary.html", 100));
        emchoi.add(new File("Composite.java", 200));
        gildong.add(new File("memo.tex", 300));
        dongguk.add(new File("game.doc", 400));
        dongguk.add(new File("junk.mail", 500));
        rootdir.printList();
    }
}
