package main;

public class Main {

    Operacion operacion = new Operacion();
    int num1, num2, suma,

    n1 = Integer.parseInt(JOptionPane.showInputDialog("dime un numero"));
    n2 = Integer.parseInt(JOptionPane.showInputDialog("dime otro numero"));
    total = operacion.sumar(num1, num2);
        JOptionPane.showMessageDialog(null, "la suma es " + suma);

}
