package main;

<<<<<<< HEAD
import models.Area;
=======

import models.Sum;
>>>>>>> 755accf617d264cd0c46922237776d3e2faf9c42

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

<<<<<<< HEAD
Area area =  new Area();

float N1;
float N2;
float rectangulo;

N1 = Float.parseFloat(JOptionPane.showInputDialog("ingrese la base "));
N2 = Float.parseFloat(JOptionPane.showInputDialog("ingrese la altura "));
rectangulo = area.area (N1, N2);

        JOptionPane.showMessageDialog(null, "El area del rectangulo es = " + rectangulo);






        }
    }
=======
        Sum sum = new Sum();
        int n1, n2, total;

              n1   = Integer.parseInt(JOptionPane.showInputDialog("ingresa el numero uno "));
            n2 = Integer.parseInt(JOptionPane.showInputDialog("ingresa el numero dos "));
        total = sum.suma(n1, n2);

        JOptionPane.showMessageDialog(null, "la suma es " + total);


    }
}
>>>>>>> 755accf617d264cd0c46922237776d3e2faf9c42
