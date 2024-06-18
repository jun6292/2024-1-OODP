package WordProblemGenerator.workbook.answer;

import java.util.List;

public class SubProblemAnswer extends ProblemAnswer {
    @Override
    public Integer createAnswer(List<Integer> operandList) {
        Integer result = operandList.get(0);
        for (int i = 1; i < operandList.size(); i++)
            result -= operandList.get(i);
        return result;
    }
}
