package main;

import models.Perimetro;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Perimetro perimetro = new Perimetro();
float R;
float Circulo;

       R = Float.parseFloat(JOptionPane.showInputDialog("Cual es el radio "));

       Circulo = perimetro.perimetro(R);
        JOptionPane.showMessageDialog(null, "El perimetro es = " + Circulo);
    }

}
