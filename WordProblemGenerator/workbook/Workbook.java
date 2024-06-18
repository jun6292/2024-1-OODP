package WordProblemGenerator.workbook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Workbook {
    private List<Problem> workbook;

    public Workbook(){
        workbook = new ArrayList<>();

        ProblemInfo info = new ProblemInfo();
        info.inputInformation();

        int numProblemsEach = info.problemNum / info.operationList.size();
        int numProblemsRemaining = info.problemNum - (numProblemsEach * info.operationList.size());

        for (String operation : info.operationList)
            for (int i = 0; i < numProblemsEach; i++)
                workbook.add(new Problem(info, operation));

        for (int i = 0; i < numProblemsRemaining; i++)
            workbook.add(new Problem(info, info.operationList.get(i)));

        for (Problem p : workbook)
            p.createProblem();
    }

    public void solveWorkbook() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        Integer currentScore = 0;

        Collections.shuffle(workbook);

        System.out.println("\n---------------------------------- Problem ----------------------------------");

        for (int i = 0; i < workbook.size(); i++) {
            Problem p = workbook.get(i);
            System.out.println("\n" + (i + 1) + ". " + p.getWordProblem());
            try {
                input = br.readLine();
                input = input.replace(" ", "");
                Object answer = null;
                if (input.contains(".")) {
                    answer = Float.parseFloat(input);
                }
                else {
                    answer = Integer.parseInt(input);
                }
                if (answer.equals(p.getAnswer())) {
                    System.out.println("정답입니다.");
                    currentScore += 1;
                } else
                    System.out.println("오답입니다.");
            } catch (IOException e) {
                System.err.println(e);
            }
        }

        System.out.println("\n---------------------------------- Score ----------------------------------");
        System.out.println(workbook.size()+ "문제 중에 " + currentScore + "문제를 맞췄습니다.");
    }

    public List<Problem> getWorkbook() {
        return workbook;
    }
}
