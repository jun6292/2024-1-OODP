package DecoratorPattern;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("DecoratorPattern.Shape: DecoratorPattern.Circle");
    }
}
