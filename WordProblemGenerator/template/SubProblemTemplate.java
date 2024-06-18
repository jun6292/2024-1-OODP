package WordProblemGenerator.template;

import java.util.ArrayList;
import java.util.List;

public class SubProblemTemplate extends WordProblemTemplate {
    public SubProblemTemplate() {
        sentences = new ArrayList<>();
        this.subProblem();
    }
    public void subProblem() {
        sentences.add("(이름1)은 (항목)을 (숫자1)개 가지고 있습니다. (이름1)은 (이름2)에게 (항목) (숫자2)개를 주었습니다.\n(이름1)에게 몇 개의 (항목)가 남았습니까?");
    }

    @Override
    public List<String> generateSentences() {
        return sentences;
    }
}
