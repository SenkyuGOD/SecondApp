public class Zadacha16 {
    public static void main(String[] args) {
        int number = 1234;

        int num1;
        num1 = number / 1000;

        int num2;
        num2 = number % 1000 / 100;

        int num3;
        num3 = number % 100 / 10;

        int num4;
        num4 = number % 10;

        int result;
        result = num1 * num2 * num3 * num4;

        System.out.println("Произведение цифр четырёхзначного числа = "+ result);
    }
}
