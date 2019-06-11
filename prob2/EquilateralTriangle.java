package prob2;

public class EquilateralTriangle implements Polygon {

    private double side;

    public EquilateralTriangle(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double[] getSides() {
        double side = getSide();
        double[] sides = new double[3];

        sides[0] = side;
        sides[1] = side;
        sides[2] = side;

        return sides;
    }
}
