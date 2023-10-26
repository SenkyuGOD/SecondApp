public class Zadacha17 {
    public static void main(String[] args) {
        double a = 7;
        double b = 9;

        double averageArithmetic = (Math.pow(a,3)+Math.pow(b,3))/2;

        double averageGeometric = Math.sqrt(Math.abs(a) * Math.abs(b));

        System.out.println("Среднее геометрическое кубов = " + averageGeometric);
        System.out.println("Среднее арифметическое кубов = " + averageArithmetic);

    }
}
