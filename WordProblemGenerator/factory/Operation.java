package WordProblemGenerator.factory;

public enum Operation {
    ADD("+"), SUB("-"), MUL("*"), DIV("/");
    private final String type;

    Operation(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
