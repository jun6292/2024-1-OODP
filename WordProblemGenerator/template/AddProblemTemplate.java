package WordProblemGenerator.template;

import java.util.ArrayList;
import java.util.List;

public class AddProblemTemplate extends WordProblemTemplate {
    public AddProblemTemplate() {
        sentences = new ArrayList<>();
        this.addProblem();
    }
    public void addProblem() {
        sentences.add("(이름1)은 (항목)을 (숫자1)개 가지고 있습니다. (이름2)은 (항목)을 (숫자2)개 가지고 있습니다.\n 그들이 가지고 있는 (항목)은 모두 몇 개입니까?");

    }
    @Override
    public List<String> generateSentences() {
        return sentences;
    }
}
