package ejerciciosretosudea;

public class SumaPares {
    public static int sumaPares(int[] vector) {
        int s = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] % 2 == 0 && vector[i] >= 0){
                s += vector[i];
            } else if (vector[i] % 2 != 0 && vector[i] >= 0){
                s += 0;
            } 
        }
        
        return s;
    }
    public static void main(String[] args) {
        int[] vectorEntrada = {0, 2, 1, 65, 66, 78, 12, 11, 90, 13, -8};
        System.out.println(sumaPares(vectorEntrada));
    }
}
