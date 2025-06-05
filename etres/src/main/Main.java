package main;

import models.Conversion;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        Conversion conversion = new Conversion();

        float N1 = 0;
        float Farenheit;

                N1 = Float.parseFloat(JOptionPane.showInputDialog("Temperatura en celcios "));


        Farenheit = conversion.conversion(N1);
 JOptionPane.showMessageDialog(null, "El equivalente en Farenheit es = " + Farenheit);


    }


}
