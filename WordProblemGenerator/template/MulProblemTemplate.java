package WordProblemGenerator.template;

import java.util.ArrayList;
import java.util.List;

public class MulProblemTemplate extends WordProblemTemplate {
    public MulProblemTemplate() {
        sentences = new ArrayList<>();
        this.mulProblem();
    }
    public void mulProblem() {
        sentences.add("(이름)은 (숫자1)개의 (항목)을 (숫자2)묶음 가지고 있습니다.\n(이름)은 전부 (항목)이 몇 개입니까?");
    }
    @Override
    public List<String> generateSentences() {
        return sentences;
    }
}
