public class Circle implements Shape {

    private Integer radius;

    public Circle(Integer radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        Main.graphicsContext.fillOval(Main.getRandomNumber(Main.canvasWidth - this.radius), Main.getRandomNumber(Main.canvasHeight - this.radius), this.radius, this.radius);
        Main.graphicsContext.restore();
    }
}
