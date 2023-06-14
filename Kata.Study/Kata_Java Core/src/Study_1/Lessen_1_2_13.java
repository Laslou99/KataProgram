package Study_1;

public class Lessen_1_2_13 {

    public static void main(String[] args) {
        calcCircleRadius(4.5);
    }

    public static void calcCircleRadius(double area) {
        double radius = Math.sqrt(area / Math.PI);
        System.out.printf("%.3f", radius);//Твой код тут
    }

}
