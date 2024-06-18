package WordProblemGenerator.factory;

import WordProblemGenerator.domain.Item;
import WordProblemGenerator.domain.Person;
import WordProblemGenerator.template.WordProblemTemplate;
import WordProblemGenerator.workbook.ProblemInfo;
import WordProblemGenerator.template.AddProblemTemplate;
import WordProblemGenerator.workbook.answer.AddProblemAnswer;
import WordProblemGenerator.workbook.answer.ProblemAnswer;

import java.util.ArrayList;
import java.util.List;

public class AddProblemFactory extends ProblemFactory {
    public AddProblemFactory() {
        personList = new ArrayList<>();
        itemList = new ArrayList<>();
        operandList = new ArrayList<>();
    }

    @Override
    public String createProblem(ProblemInfo problemInfo) {
        createInfo(problemInfo);

        WordProblemTemplate wordProblemTemplate = new AddProblemTemplate();
        List<String> sentenceList = wordProblemTemplate.generateSentences();
        String wordProblem = sentenceList.get(0);

        wordProblem = wordProblem.replace("(이름1)", personList.get(0).getPersonName());
        wordProblem = wordProblem.replace("(이름2)", personList.get(1).getPersonName());
        wordProblem = wordProblem.replace("(항목)", itemList.get(0).getItemName());
        wordProblem = wordProblem.replace("(숫자1)", Integer.toString(operandList.get(0)));
        wordProblem = wordProblem.replace("(숫자2)", Integer.toString(operandList.get(1)));

        return wordProblem;
    }

    private void createInfo(ProblemInfo problemInfo) {
        Person person1 = problemInfo.randomPerson();
        Person person2 = null;

        while (person2 == null || person2.equals(person1)) {
            person2 = problemInfo.randomPerson();
        }

        Item item = problemInfo.randomItem();
        Integer number1 = problemInfo.randomOperand();
        Integer number2 = problemInfo.randomOperand();

        personList.add(person1);
        personList.add(person2);
        itemList.add(item);
        operandList.add(number1);
        operandList.add(number2);
    }

    @Override
    public Integer createAnswer() {
        ProblemAnswer problemAnswer = new AddProblemAnswer();
        return (Integer) problemAnswer.createAnswer(operandList);
    }
}
