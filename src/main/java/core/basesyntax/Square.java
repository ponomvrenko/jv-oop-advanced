package core.basesyntax;

public class Square extends Figure {
    private final double side;

    public Square(double side, String color) {
        this.side = side;
        this.color = color;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println(
                "Shape: square, area: " + getArea() + " sq. units,"
                        + " side: " + side + " unit.,"
                        + " color: " + color);
    }
}