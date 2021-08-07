package interfacesgraficas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.ArrayList;

public class Matriz extends JFrame implements ActionListener {
    JFrame f;
    JButton b, boton2;
    ArrayList<JButton> botones = new ArrayList<>();
    public int num = 0;
    
    Matriz() {
        b = new JButton("Crear Matriz");
        b.setBounds(50, 50, 350, 100);
        this.add(b);
        this.setSize(450, 200);
        this.setLayout(null);
        this.setVisible(true);
        b.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int contador = 1;
        
        if (e.getSource() == b) {
            num += 1;
            for(int i=0;i<90;i+=30) {
                for(int j=0;j<450;j+=150) {
                    boton2 = new JButton();
                    boton2.setBounds(j, i, 150, 30);
                    boton2.setText(String.valueOf(contador));
                    this.add(boton2);
                    boton2.setVisible(true);
                    contador++;
                    boton2.addActionListener(this);
                    botones.add(boton2);
                }
            }
            b.setBounds(130, 100, 130+num*5, 40+num*5);
        }
        repaint();
    }
    
    public static void main(String[] args) {
        new Matriz();
    }
}
