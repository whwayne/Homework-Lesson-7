package Homework_Lesson7.prob2;

public class Ellipse implements ClosedCurve {

    private double semiMajorAxis;
    private double ellipIntegralEccentricity;


    public Ellipse(double semiMajorAxis, double ellipIntegralEccentricity) {
        this.semiMajorAxis = semiMajorAxis;
        this.ellipIntegralEccentricity = ellipIntegralEccentricity;
    }

    public double getSemiMajorAxis() {
        return semiMajorAxis;
    }

    public double getEllipIntegralEccentricity() {
        return ellipIntegralEccentricity;
    }

    @Override
    public double computePerimeter() {
        return 4 * semiMajorAxis * ellipIntegralEccentricity;
    }
}
