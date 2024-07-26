package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
        if (firstSide <= 0.0 || secondSide <= 0.0 || thirdSide <= 0.0) {
            System.out.println("it's not a triangle");
        } else {
            double sumSides = firstSide + secondSide + thirdSide;
            double maxSide = firstSide > secondSide ? (firstSide > thirdSide ? firstSide : thirdSide) : (secondSide > thirdSide ? secondSide : thirdSide);
            double shortestTwoSides = sumSides - maxSide;
            if (shortestTwoSides > maxSide) {
                System.out.println("this is a valid triangle");
            } else {
                System.out.println("it's not a triangle");
            }
        }
    }
}
