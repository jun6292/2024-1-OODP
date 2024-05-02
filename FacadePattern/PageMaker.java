package FacadePattern;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PageMaker {
    private PageMaker() {
    }

    public static void makeWelcomePage(String mailaddr, String filename) throws IOException {
        Properties mailProp = Database.getProperties("maildata");
        String username = mailProp.getProperty(mailaddr);
        HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
        writer.title(username + "'s web page!");
        writer.paragraph("welcome to " + username + "'s web page!");
        writer.paragraph("Nice to meet you!");
        writer.mailto(mailaddr, username);
        writer.close();
    }
}
