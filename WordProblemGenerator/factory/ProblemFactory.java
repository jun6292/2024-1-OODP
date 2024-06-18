package WordProblemGenerator.factory;

import WordProblemGenerator.domain.Item;
import WordProblemGenerator.domain.Person;
import WordProblemGenerator.workbook.ProblemInfo;

import java.util.List;


public abstract class ProblemFactory {
    public abstract String createProblem(ProblemInfo problemInfo);
    protected List<Person> personList;
    protected List<Item> itemList;
    protected List<Integer> operandList;
    public abstract Object createAnswer();
}
