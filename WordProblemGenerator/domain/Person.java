package WordProblemGenerator.domain;

public class Person extends Data {
    private String personName;

    public Person(String name) {
        this.personName = name;
    }

    public String getPersonName() {
        return personName;
    }
}
