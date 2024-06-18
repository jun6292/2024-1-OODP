package WordProblemGenerator.ui;

import WordProblemGenerator.domain.Item;
import WordProblemGenerator.domain.Person;

import java.util.List;

public interface InputManager {
    List<Person> inputPerson();
    List<Item> inputItem();
    List<String> inputOperation();
    Integer inputProblemNum();
    Integer inputOperandMin();
    Integer inputOperandMax();
}
