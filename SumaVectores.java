package ejerciciosretosudea;

public class SumaVectores {
    public static int[] sumaVectorial(int[] v1, int[] v2){
        int sumas [] = new int[v1.length];
        for (int x = 0; x < sumas.length; x++){
            sumas[x] = v1[x] + v2[x];
        }
        return sumas;
    }
}