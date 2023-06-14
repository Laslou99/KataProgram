package Study_1;

public class Lessen_1_2_10 {

    public static void main(String[] args) {
        doubleExpression(1,2,3);
    }

    public static boolean doubleExpression(double a, double b, double c) {
        return Math.abs(a + b - c) <= 0.0001;
    }

}
