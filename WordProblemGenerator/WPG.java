package WordProblemGenerator;

import WordProblemGenerator.workbook.Workbook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WPG {
    public static void main(String[] args) {
        WPG wpg = new WPG();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean restart = true;

        while (restart) {
            Workbook workbook = new Workbook();
            workbook.solveWorkbook();

            System.out.println("\n프로그램을 종료하시겠습니까? (y/n)");
            try {
                String input = br.readLine();
                input = input.replace(" ", "");
                if (input.equals("Y") || input.equals("y"))
                    restart = false;
            }
            catch (IOException e) {
                System.err.println(e);
            }
        }
    }
}
