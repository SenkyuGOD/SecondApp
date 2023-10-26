public class Zadacha19 {
    public static void main(String[] args) {
         double a = 10;

         double square = (Math.pow(a,2) * Math.sqrt(3))/4;

         double h = (Math.sqrt(3) / 2) * a;

         double r = h/2;

         double R = a/2;


        System.out.println("Площадь треугольника = " + square);
        System.out.println("Высота треугольник = " + h);
        System.out.println("Радиус вписанной окружности = " + r);
        System.out.println("Радиус описанной окружности = " + R);
    }
}
