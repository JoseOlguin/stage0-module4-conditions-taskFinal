package school.mjc.stage0.conditions.finalTask;

public class CoordinatePane {
    public void printQuadrant(int x, int y) {
        System.out.println(
            x == 0 && y == 0 ? "zero"   :
            x  > 0 && y  > 0 ? "first"  :
            x  < 0 && y  > 0 ? "second" :
            x  < 0 && y  < 0 ? "third"  :
            "fourth"
        );
    }
}
