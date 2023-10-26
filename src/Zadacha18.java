public class Zadacha18 {
    public static void main(String[] args) {
        double a = 5;

        double faceArea = Math.pow(a,2);

        double totalSurfaceArea = 6 * faceArea;

        double cubeVolume = Math.pow(a,3);

        System.out.println("Площадь грани = " + faceArea);
        System.out.println("Площадь полной поверхности = " + totalSurfaceArea);
        System.out.println("Объём куба = " + cubeVolume);
    }
}
