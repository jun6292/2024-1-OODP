package WordProblemGenerator.template;

import java.util.List;

// 템플릿 메소드 패턴을 적용
public abstract class WordProblemTemplate {
    public List<String> sentences;
    public abstract List<String> generateSentences();
}
