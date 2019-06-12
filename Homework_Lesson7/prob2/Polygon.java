package Homework_Lesson7.prob2;

interface Polygon extends ClosedCurve {

    default double computePerimeter(){
        double[] sides = getSides();
        double sum = 0.0;
        for(double s : sides) {
            sum += s;
        }
        return sum;
    }
    double[] getSides();
}
