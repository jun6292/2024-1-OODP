package WordProblemGenerator.factory;

import WordProblemGenerator.domain.Item;
import WordProblemGenerator.domain.Person;
import WordProblemGenerator.template.MulProblemTemplate;
import WordProblemGenerator.workbook.ProblemInfo;
import WordProblemGenerator.template.WordProblemTemplate;
import WordProblemGenerator.workbook.answer.MulProblemAnswer;
import WordProblemGenerator.workbook.answer.ProblemAnswer;

import java.util.ArrayList;
import java.util.List;

public class MulProblemFactory extends ProblemFactory {
    public MulProblemFactory() {
        personList = new ArrayList<>();
        itemList = new ArrayList<>();
        operandList = new ArrayList<>();
    }

    @Override
    public String createProblem(ProblemInfo problemInfo) {
        createInfo(problemInfo);

        WordProblemTemplate wordProblemTemplate = new MulProblemTemplate();
        List<String> sentenceList = wordProblemTemplate.generateSentences();
        String wordProblem = sentenceList.get(0);

        wordProblem = wordProblem.replace("(이름)", personList.get(0).getPersonName());
        wordProblem = wordProblem.replace("(항목)", itemList.get(0).getItemName());
        wordProblem = wordProblem.replace("(숫자1)", Integer.toString(operandList.get(0)));
        wordProblem = wordProblem.replace("(숫자2)", Integer.toString(operandList.get(1)));

        return wordProblem;
    }

    private void createInfo(ProblemInfo problemInfo) {
        Person person = problemInfo.randomPerson();

        Item item = problemInfo.randomItem();
        Integer number1 = problemInfo.randomOperand();
        Integer number2 = problemInfo.randomOperand();

        personList.add(person);
        itemList.add(item);
        operandList.add(number1);
        operandList.add(number2);
    }

    @Override
    public Integer createAnswer() {
        ProblemAnswer problemAnswer = new MulProblemAnswer();
        return (Integer) problemAnswer.createAnswer(operandList);
    }
}
