public class Circle implements Shape {

    private Integer radius;

    public Circle(Integer radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        //TODO
        System.out.println("Drawing: Circle");
    }
}
