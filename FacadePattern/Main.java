package FacadePattern;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        PageMaker.makeWelcomePage("gdhong@examples.com", "FacadePattern/welcome.html");
    }
}
