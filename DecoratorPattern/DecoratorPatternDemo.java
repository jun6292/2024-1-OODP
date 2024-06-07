package DecoratorPattern;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("DecoratorPattern.Circle with normal border");
        circle.draw();
        System.out.println("\nDecoratorPattern.Circle of red border");
        redCircle.draw();
        System.out.println("\nDecoratorPattern.Rectangle of red border");
        redRectangle.draw();
    }
}
