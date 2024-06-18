package WordProblemGenerator.workbook.answer;

import java.text.DecimalFormat;
import java.util.List;

public class DivProblemAnswer extends ProblemAnswer {
    @Override
    public Object createAnswer(List<Integer> operandList) {
        if (operandList.get(0) % operandList.get(1) == 0) {
            return Integer.valueOf(operandList.get(0) / operandList.get(1));
        }
        else {
            Float result = ((float) operandList.get(0)) / operandList.get(1);
            DecimalFormat form = new DecimalFormat("0.00");
            result = Float.parseFloat(form.format(result));
            return result;
        }
    }
}
