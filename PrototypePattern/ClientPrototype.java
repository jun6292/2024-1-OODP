package PrototypePattern;

public class ClientPrototype {
    public static void main(String[] args) {
        ConcretePrototype prototype = new ConcretePrototype("Original Object");
        ConcretePrototype clone = (ConcretePrototype) prototype.clone();
        clone.setName("Cloned Object");
        System.out.println("Original Object: " + prototype.getName());
        System.out.println("Clone Object: " + clone.getName());
    }
}
