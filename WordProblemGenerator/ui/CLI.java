package WordProblemGenerator.ui;

import WordProblemGenerator.domain.Item;
import WordProblemGenerator.domain.Person;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CLI implements InputManager {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    @Override
    public List<Person> inputPerson() {
        List<Person> personList = new ArrayList<>();
        System.out.println("\n자녀에게 중요한 사람들의 이름을 ,로 구분하여 입력하세요. (예: 홍길동, 김철수)");
        try {
            String[] names = preProcessInput(br.readLine());
            for (String name : names) {
                personList.add(new Person(name));
            }
        } catch (IOException e) {
            System.err.println(e);
        }
        return personList;
    }

    @Override
    public List<Item> inputItem() {
        List<Item> itemList = new ArrayList<>();
        System.out.println("\n자녀가 관심을 갖고 있는 항목의 이름을 ,로 구분하여 입력하세요. (예: 아이스크림, 사탕)");
        try {
            String[] names = preProcessInput(br.readLine());
            for (String name : names) {
                itemList.add(new Item(name));
            }
        } catch (IOException e) {
            System.err.println(e);
        }
        return itemList;
    }

    @Override
    public List<String> inputOperation() {
        List<String> operationList = new ArrayList<>();
        System.out.println("\n연산의 종류(+, -, *, /)를 ,로 구분하여 입력하세요(하나 이상 가능). (예: +, -)");
        try {
            String[] operations = preProcessInput(br.readLine());
            for (String op : operations) {
                operationList.add(op);
            }
        } catch (IOException e) {
            System.err.println(e);
        }
        return operationList;
    }

    @Override
    public Integer inputProblemNum() {
        Integer problemNum = 0;
        System.out.println("\n생성할 문제의 개수를 입력하세요. (예: 10)");
        try {
            problemNum = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            System.err.println(e);
        }
        return problemNum;
    }

    @Override
    public Integer inputOperandMin() {
        Integer operandMin = 0;
        System.out.println("\n생성할 피연산자의 최솟값을 입력하세요. (예: 1)");
        try {
            operandMin = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            System.err.println(e);
        }
        return operandMin;
    }

    @Override
    public Integer inputOperandMax() {
        Integer operandMax = 0;
        System.out.println("\n생성할 피연산자의 최댓값을 입력하세요. (예: 100)");
        try {
            operandMax = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            System.err.println(e);
        }
        return operandMax;
    }

    private String[] preProcessInput(String input) {
        input = input.replace(" ", "");
        String[] names = input.split(",");
        return names;
    }
}
