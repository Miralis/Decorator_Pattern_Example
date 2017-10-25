public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle(100);
        Shape redCircle = new RedBorderDecorator(new Circle(100));
        Shape redRectangle = new RedBorderDecorator(new Rectangle(100, 50));

        System.out.println("Circle with normal border:");
        circle.draw();

        System.out.println("Circle with red border:");
        redCircle.draw();

        System.out.println("Rectangle with red border:");
        redRectangle.draw();
    }
}