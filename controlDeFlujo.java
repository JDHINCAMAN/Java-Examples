package controlDeFlujo;

public class controlDeFlujo {
    public static void main(String[] args) {
        // Sentencias if - else if - else
       double nota = 3.8;
       if (nota >= 0 && nota <=1){
           System.out.println("Deficiente");
       } else if (nota > 1 && nota <= 3) {
           System.out.println("Insuficiente");
       } else if (nota > 3 && nota <= 4) {
           System.out.println("Aprobado");
       } else if (nota >4 && nota <= 5){
           System.out.println("Excelente");
       } else {
           System.out.println("Nota invalida");
       }
       
       // Sentencia switch
       int dia = 5;
       String nombreDia;
       switch (dia) {
           case 1:
               nombreDia = "Lunes";
               break;
           case 2:
               nombreDia = "Martes";
               break;
           case 3:
               nombreDia = "Miercoles";
               break;
           case 4:
               nombreDia = "Jueves";
               break;
           case 5:
               nombreDia = "Viernes";
               break;
           case 6:
               nombreDia = "Sabado";
               break;
           case 7:
               nombreDia = "Domingo";
               break;
           default:
               nombreDia = "Dia invalido";
               break;
       }
        System.out.println(nombreDia);
        
        int mes = 6;
        int anio = 2021;
        int numeroDias = 0;
        
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numeroDias = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numeroDias = 30;
                break;
            case 2:
                if ((anio % 4 == 0) && !(anio % 100 == 0)
                        || (anio % 400 == 0)) {
                    numeroDias = 29;
                } else {
                    numeroDias = 28;
                }
                break;
            default:
                System.out.println("Mes invalido");
                break;
        }
        System.out.println("El mes " + mes + " tiene " + numeroDias + " dias");
        
        // Sentencia While
        int numero = 3;
        int i = 0;
        while (i <= 10) {
            System.out.println(numero + " * " + i + " = " + numero*i);
            i += 1;
        }
        
        // Sentencia do - while
        int j = 10;
        do {
            System.out.println(j);
            j--;
        } while (j > 0);
        
        // sentencia For
        for (int k = 1; k < 11; k++) {
            System.out.println("La cuenta va en " + k);
        }
    }
    
}
