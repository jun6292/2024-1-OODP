package WordProblemGenerator.template;

import java.util.ArrayList;
import java.util.List;

public class DivProblemTemplate extends WordProblemTemplate {
    public DivProblemTemplate() {
        sentences = new ArrayList<>();
        this.divProblem();
    }
    public void divProblem() {
        sentences.add("(이름)은 (항목)을 (숫자1)개 가지고 있습니다. (이름)은 (숫자2)의 친구에게 똑같이 나누어 주고 싶습니다.\n각각 (항목)을 몇 개씩 가지게 되나요?");
    }
    @Override
    public List<String> generateSentences() {
        return sentences;
    }
}
