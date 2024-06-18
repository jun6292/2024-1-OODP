package WordProblemGenerator.workbook;

import WordProblemGenerator.factory.FactoryManager;
import WordProblemGenerator.factory.ProblemFactory;

public class Problem {
    private ProblemInfo problemInfo;
    private String operationType;
    private Object answer;
    private String wordProblem;

    public Problem(ProblemInfo problemInfo, String operationType) {
        this.problemInfo = problemInfo;
        this.operationType = operationType;
    }

    public ProblemFactory createProblem() {
        FactoryManager factory = new FactoryManager();
        ProblemFactory problem = factory.getFactory(operationType);
        wordProblem = problem.createProblem(problemInfo);
        answer = problem.createAnswer();
        return problem;
    }

    public Object getAnswer() {
        return answer;
    }

    public String getWordProblem() {
        return wordProblem;
    }
}
