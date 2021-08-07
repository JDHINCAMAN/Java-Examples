package ejerciciosretosudea;

public class Promedio {
    public static double mean(int[] vector) {
        double promedio = 0;
        double s = 0;
        for (int i = 0; i < vector.length; i++) {
            s += vector[i];
            promedio = s / vector.length;
        }
        return promedio;
    }
    public static void main(String[] args) {
        int[] vectorEntrada = {0, 2, 1, 65, 66, 78, 12, 11, 90, 13, -8};
        System.out.println(mean(vectorEntrada));
    }
}
