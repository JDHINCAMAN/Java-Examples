package ejerciciosretosudea;
import java.util.Scanner;

public class EjercicioFactorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("");
        long num = input.nextLong();
        int factorial = 1;
        int i = 1;
        while (i <= num) {
            factorial = factorial * i;
            i++;
        }
        System.out.println(factorial);
    }
}
