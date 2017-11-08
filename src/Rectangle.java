public class Rectangle implements Shape {

    private Integer width, height;

    public Rectangle(Integer width, Integer height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        Main.graphicsContext.fillRect(Main.getRandomNumber(Main.canvasWidth - this.width), Main.getRandomNumber(Main.canvasHeight - this.height), this.width, this.height);
        Main.graphicsContext.restore();
    }
}
