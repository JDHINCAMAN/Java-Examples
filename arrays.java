package arrays;

public class arrays {
    public static void main(String[] args) {
        /* En primer lugar, es necesario declarar el array. 
        para esto, escribimos el tipo de datos, un par de 
        corchetes y el nombre del array */
        double[] calificaciones;
        
        /* procedemos a crearlo usando la palabra clave new,
        es en este punto donde le asignamos un tamaño 
        (para este caso, de 8 elementos) */
        calificaciones = new double[8];
        
        /* O se puede escribir en una sola linea
        double[] calificaciones = new double[8];
        */
        
        // Asignar valores a cada elemento
        calificaciones[0] = 4.5;
        calificaciones[1] = 3.8;
        calificaciones[2] = 4.6;
        calificaciones[3] = 2.1;
        calificaciones[4] = 4.4;
        calificaciones[5] = 3.6;
        calificaciones[6] = 3.9;
        calificaciones[7] = 5.0;
        
        // Obtener el tamaño del array usando la palabra clave length
        System.out.println(calificaciones.length);
        
        for (int i = 0; i < calificaciones.length; i++){
            System.out.println(calificaciones[i]);
        }
        
        // Otra forma de hacer un array
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (int j = 0; j < cars.length; j++) {
            System.out.println(cars[j]);
        }
    }
}
