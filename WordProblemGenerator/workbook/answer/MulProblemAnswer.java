package WordProblemGenerator.workbook.answer;

import java.util.List;

public class MulProblemAnswer extends ProblemAnswer {
    @Override
    public Integer createAnswer(List<Integer> operandList) {
        Integer result = 1;
        for (Integer num : operandList)
            result *= num;
        return result;
    }
}
