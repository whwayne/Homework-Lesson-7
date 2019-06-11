package prob2;

public class Rectangle implements Polygon {
	private double length, width;
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}

	@Override
	public double[] getSides() {
		double width = getWidth();
		double length = getLength();
		double[] sides = new double[4];

		sides[0] = width;
		sides[1] = width;
		sides[2] = length;
		sides[3] = length;

		return sides;
	}
}
