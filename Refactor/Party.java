package Refactor;

public abstract class Party {
    public void printNameAndDetails() {
        printName();
        printDetails();
    }
    public abstract void printName();
    public abstract void printDetails();
}
