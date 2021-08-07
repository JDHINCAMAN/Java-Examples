package claseProfesor;

public class claseProfesor {
    public static void main(String[] args) {
        // Uso de la instrucción print
        System.out.println("Hola");
        System.out.printf("El valor es %.3f %n", 12.3698);
        
        // Imprimir mas de una variable
        double n = 1.25036;
        int x = 10;
        System.out.printf("n = %.2f x = %d %n", n, x);
        
        System.out.println("\u2605");
        
        System.out.printf("hola %10s %n","hola");
        
        String fmt = "%-30s %-20s %-20s %n";
  
               
        System.out.printf(fmt, "Libros", "Autor", "Precio");
        System.out.printf(fmt, "-----", "------", "-----");
        System.out.printf(fmt, "Matematicas", "Navathe", "80.000");
        System.out.printf(fmt, "Algoritmos", "Cormen", "92.250");
        System.out.printf(fmt, "Introducción al cálculo", "Rajib Mall", "75.000");
               
        System.out.printf("%-30s %-20.2f %-20d \n", "Libros", 5.3596, 456);
        
        int a=0;
        a+=2;
        
        int y = 0;      // y = 0
        y = y + (a--);  // y =  0 + 2 tambien a a le resta 1.
        
        System.out.println("\n a= "+ a);
        
        int t=0;
        t = t + (++a);
                
        System.out.println("y= "+ y);
        System.out.println("t= "+ t);
        System.out.println("a= "+ a);
        
        boolean d = (t==2);
        
        System.out.println("d= "+ d);
        
        String texto ="hola";
        
        System.out.println(texto.equals("hla")); // texto == "hola"
        
        System.out.println("hola".equals("hla")); // texto == "hola"
        
        String fruta="Pera";
                
        if (fruta.equals("Manzana")){
            System.out.println("Es una manzana");
        
        }else{
            System.out.println("No es una manzana");                    
        }
        
        if(1==2){
            System.out.println("Es falso");

        }else{
            System.out.println("Es verdadero");
        }
        
        
        String mes= "Marzo";   
        
       
        switch(mes){
            case "Enero":
                System.out.println("Cumplen años: Juan y Pedro");
                break;
                
            case "Febrero":
                System.out.println("Cumplen años: Lina y David");
                break;
                
            case "Marzo":
                System.out.println("Cumplen años: Dubian y David");
                break;
        }
    }       
}