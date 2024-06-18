package WordProblemGenerator.factory;

public class FactoryManager {
    public static ProblemFactory getFactory(String op) {
        if (op.equals(Operation.ADD.getType())) {
            return new AddProblemFactory();
        } else if (op.equals(Operation.SUB.getType())) {
            return new SubProblemFactory();
        } else if (op.equals(Operation.MUL.getType())) {
            return new MulProblemFactory();
        } else if (op.equals(Operation.DIV.getType())) {
            return new DivProblemFactory();
        } else {
            throw new IllegalArgumentException("유효하지 않은 연산자입니다: " + op);
        }
    }
}
