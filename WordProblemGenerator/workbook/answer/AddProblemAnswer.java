package WordProblemGenerator.workbook.answer;

import java.util.List;

public class AddProblemAnswer extends ProblemAnswer {
    @Override
    public Integer createAnswer(List<Integer> operandList) {
        Integer result = 0;
        for (Integer number : operandList)
            result += number;
        return result;
    }
}
