package clase10;

import javax.swing.JOptionPane;

public class Figuras {

    public void cuadrado() {
        int lado, area;
        lado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el lado del caudrado"));
        area = lado * lado;
        JOptionPane.showMessageDialog(null, " El area de cuadrado es :" + area);
    }
    public void triangulo() {
        double base, altura, area;
        base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base del triangulo"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del triangulo"));
        area = (base * altura) / 2;
        JOptionPane.showMessageDialog(null, " El area de triangulo es :" + area);
    }
    public void circulo(){
        double radio,pi=3.14,area;
        radio= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del circulo del circulo"));
        area=pi*Math.pow(radio, 2);
         JOptionPane.showMessageDialog(null, " El area del circulo :" + area);
    }
}
