public class Zadacha10 {
    public static void main(String[] args) {
        double x = 45;
        double y = 30;

        double z;

        z = ((Math.sin(x) - Math.cos(y))/(Math.cos(x) - Math.sin(y)) * Math.tan(x * y));

        z = Math.toDegrees(z);

        System.out.println("z = "+z);
    }
}
