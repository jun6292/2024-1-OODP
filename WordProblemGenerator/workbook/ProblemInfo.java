package WordProblemGenerator.workbook;

import WordProblemGenerator.domain.Item;
import WordProblemGenerator.domain.Person;
import WordProblemGenerator.ui.CLI;
import WordProblemGenerator.ui.InputManager;

import java.util.List;
import java.util.Random;

public class ProblemInfo {
    public List<String> operationList;
    public List<Person> personList;
    public List<Item> itemList;
    public Integer minOperand;
    public Integer maxOperand;
    public Integer problemNum;

    public Person randomPerson() {
        Random rand = new Random();
        int n = rand.nextInt(personList.size());
        return personList.get(n);
    }

    public Item randomItem() {
        Random rand = new Random();
        int n = rand.nextInt(itemList.size());
        return itemList.get(n);
    }

    public Integer randomOperand() {
        Random rand = new Random();
        Integer n = rand.nextInt(maxOperand) + minOperand;
        return n;
    }

    public void inputInformation() {
        InputManager input = new CLI();
        personList = input.inputPerson();
        itemList = input.inputItem();
        operationList = input.inputOperation();
        problemNum = input.inputProblemNum();
        minOperand = input.inputOperandMin();
        maxOperand = input.inputOperandMax();
    }
}
