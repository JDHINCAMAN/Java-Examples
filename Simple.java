package interfacesgraficas;

import javax.swing.*;

public class Simple {
    JFrame f;
    
    //constructor
    Simple() {
        f = new JFrame(); //Crear una instancia de JFrame
        
        JButton b = new JButton("Click"); //Crear instancia de JButton
        b.setBounds(130, 100, 100, 40); //Tamaño y posicion del boton
        f.add(b); //Añadir boton a JFrame
        f.setSize(400, 500); //Definir tamaño der frame
        f.setLayout(null); //No se define nungun tipo de distribucion
        f.setVisible(true); //Poner visible el frame
    }
    
    public static void main(String[] args) {
        Simple Ventana = new Simple();
    }
}
