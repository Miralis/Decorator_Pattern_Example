public class Rectangle implements Shape {

    private Integer length, width;

    public Rectangle(Integer length, Integer width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        //TODO
        System.out.println("Drawing: Rectangle");
    }
}
