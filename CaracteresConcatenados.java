package ejerciciosretosudea;

public class CaracteresConcatenados {
    public static String join(char[] vector) {
        String vectorConcatenado = "";
        for (int i = 0; i < vector.length; i++) {
            vectorConcatenado += vector[i];
        }
        return vectorConcatenado;
    }
    
    public static void main(String[] args) {
       char [] vector = {' ','P', 'r','o',' ', 'g', 'r','a',' ','m','a', 'r'}; 
        System.out.println(join(vector));
    }
}
