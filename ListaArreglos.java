package arrays;
import java.util.ArrayList;

public class ListaArreglos {
    public static void main(String[] args) {
        //ArrayList<Integer> numeros = new ArrayList<Integer>();
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(8);
        numeros.add(427);
        numeros.add(-75);
        numeros.add(87);
        
        System.out.println(numeros.toString());
        System.out.println("El tamaño del array es: ");
        System.out.println(numeros.size());
        System.out.println("Obtener el valor de un elemento");
        System.out.println(numeros.get(1));
        System.out.println("Eliminar un elemento");
        numeros.remove(2);
        System.out.println(numeros.size());
        System.out.println("Array completo");
        System.out.println(numeros.toString());
        System.out.println("Vaciar el array por completo");
        numeros.clear();
        System.out.println(numeros.size());
    }
}
