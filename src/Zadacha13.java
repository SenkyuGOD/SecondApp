public class Zadacha13 {
    public static void main(String[] args) {
            double x1 = 4;
            double y1 = 4;

            double x2 = 8;
            double y2 = 8;

            double x3 = 12;
            double y3 = 4;

            double d1 = Math.sqrt(Math.pow(x2 - x1,2) + Math.pow(y2 - y1,2));
            double d2 = Math.sqrt(Math.pow(x3 - x2,2) + Math.pow(y3 - y2,2));
            double d3 = Math.sqrt(Math.pow(x1 - x3,2) + Math.pow(y1 - y3,2));

            double P = d1 + d2 + d3;

            double s = P/2;
            double S = Math.sqrt(s * (s - d1) * (s - d2) * (s - d3) );

        System.out.println("Периметр треугольника = " + P);
        System.out.println("Площадь треугольника = " + S);
    }
}
