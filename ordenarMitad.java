/*
ingresar un array de numeros enteros y la primera mitad
la ordena de manera ascendente y la segunda mitad la
odena de manera descendente.
*/
package ejerciciosretosudea;
import java.util.Arrays;

public class ordenarMitad {
    public static int[] ordenamientoPersonalizado(int[] vector) {
        int mitadVector = vector.length / 2;
        int[] segundoVector = new int[mitadVector];
        int[] vectorOrdenado = new int[vector.length];
        
        Arrays.sort(vector, 0, mitadVector);
        Arrays.sort(vector, mitadVector, vector.length);
        
        for (int i = 0; i < mitadVector; i++) {
            segundoVector[i] = vector[mitadVector + i];
        }
        
        int aux = vector.length - 1;
        for (int j = 0; j < segundoVector.length; j++) {
            vector[j + aux] = segundoVector[j];
            aux -= 2;
        }
        
        System.arraycopy(vector, 0, vectorOrdenado, 0, vector.length);
        
        return vectorOrdenado;
    }
    
    public static void main(String[] args) {
        int [] vectorEntrada = {0, 2, 1, 65, 66, 78, 12, 11, 90, 13};
        System.out.println(Arrays.toString(ordenamientoPersonalizado(vectorEntrada)));
    }
}