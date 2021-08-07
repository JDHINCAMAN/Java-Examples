package ejerciciosretosudea;

public class Reto1 {
    //Inserte acá los atributos
    String nombre;
    char sexo;
    double posicionX = 0;
    double posicionY = 0;
    double distanciaTotal = 0;
    int numeroBotiquines = 0;
    double vida = 100;
    
    //Inserte acá el método constructor
    public Reto1(String nombre, char sexo) {
        this.nombre = nombre;
        this.sexo = sexo;
    }
    
    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    public void usarBotiquin () {
        if (numeroBotiquines != 0) {
            numeroBotiquines -= 1;
            vida += 5;
        }
    }
    
    public void recogerBotiquin() {
        numeroBotiquines += 1;
    }
    
    public void moverDerecha(double d) {
        posicionX += d;
        distanciaTotal += d;
    }
    
    public void moverIzquierda(double d) {
        posicionX -= d;
        distanciaTotal += d;
    }
    
    public void moverArriba(double d) {
        posicionY += d;
        distanciaTotal += d;
    }
    
    public void moverAbajo(double d) {
        posicionY -= d;
        distanciaTotal += d;
    }
    
    public double calcularDistanciaRespectoOrigen() {
        return Math.sqrt(Math.pow(posicionX, 2) + Math.pow(posicionY, 2));
    }
    
    //Inserte acá los SETTERS Y GETTERS
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public char getSexo() {
        return sexo;
    }
    
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    public double getPosicionX() {
        return posicionX;
    }
    public void setPosicionX(double posicionX) {
        this.posicionX = posicionX;
    }
    
    public double getPosicionY() {
        return posicionY;
    }
    
    public void setPosicionY(double posicionY) {
        this.posicionY = posicionY;
    }
    
    public double getDistanciaTotal() {
        return distanciaTotal;
    }
    
    public void setDistanciaTotal(double distanciaTotal) {
        this.distanciaTotal = distanciaTotal;
    } 
    
    public int getNumeroBotiquines() {
        return numeroBotiquines;
    }
    
    public void setNumeroBotiquines(int numeroBotiquines) {
        this.numeroBotiquines = numeroBotiquines;
    }
    
    public double getVida() {
        return vida;
    }
    
    public void setVida(double vida) {
        this.vida = vida;
    }
    
    public static void main(String[] args) {
        Reto1 personaje = new Reto1("Juan", 'm');
        
        personaje.moverDerecha(2);
        personaje.moverAbajo(5);
        personaje.moverIzquierda(1);
        System.out.print("Distancia respecto al origen: ");
        System.out.println(personaje.calcularDistanciaRespectoOrigen());
        personaje.setVida(personaje.getVida() - 40);
        System.out.print("Menos 40 de vida: ");
        System.out.println(personaje.getVida());
        personaje.recogerBotiquin();
        personaje.recogerBotiquin();
        personaje.recogerBotiquin();
        System.out.println("Recoge 3 botiquines");
        System.out.print("Numero de botiquines: ");
        System.out.println(personaje.getNumeroBotiquines());
        personaje.usarBotiquin();
        personaje.usarBotiquin();
        System.out.println("Usa 2 botiquines");
        System.out.println("");
        
        System.out.print("Numero de botiquines: ");
        System.out.println(personaje.getNumeroBotiquines());
        System.out.print("Distancia total: ");
        System.out.println(personaje.getDistanciaTotal());
        System.out.print("Nombre: ");
        System.out.println(personaje.getNombre());
        System.out.print("PosicionX: ");
        System.out.println(personaje.getPosicionX());
        System.out.print("PosicionY: ");
        System.out.println(personaje.getPosicionY());
        System.out.print("Sexo: ");
        System.out.println(personaje.getSexo());
        System.out.print("Vida: ");
        System.out.println(personaje.getVida());
    }
}
