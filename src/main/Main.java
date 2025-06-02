package main;


import models.Sum;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Sum sum = new Sum();
        int n1, n2, total;

              n1   = Integer.parseInt(JOptionPane.showInputDialog("dime un numero"));
            n2 = Integer.parseInt(JOptionPane.showInputDialog("dime otro numero"));
        total = sum.suma(n1, n2);

        JOptionPane.showMessageDialog(null, "la suma es " + total);


    }
}