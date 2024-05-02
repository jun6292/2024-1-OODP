package FacadePattern;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Database {
    private Database() {
    }

    // 데이터 파일에서 원하는 값을 찾아 온다
    public static Properties getProperties(String dbname) throws IOException {
        String filename = dbname + ".txt";
        Properties prop = new Properties();
        prop.load(new FileReader(filename));
        return prop;
    }
}
