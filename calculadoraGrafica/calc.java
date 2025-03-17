package calculadoraGrafica;

import javax.swing.JOptionPane;

class calc{
    public static void main(String[] args){
        double num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce el primer numero:"));
        String op = JOptionPane.showInputDialog(null, "Introduce el tipo de operacion que quieres hacer:");
        double num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce el segundo numero:"));

        switch(op){
            case "+":
                JOptionPane.showMessageDialog(null, "El resultado es: " + (num1 + num2));
                break;
            case "-":
                JOptionPane.showMessageDialog(null, "El resultado es: " + (num1 - num2));
                break;
            case "*":
                JOptionPane.showMessageDialog(null, "El resultado es: " + (num1 * num2));
                break;
            case "/":
                JOptionPane.showMessageDialog(null, "El resultado es: " + (num1 / num2));
                break;
            default:
            JOptionPane.showMessageDialog(null, "Ese no es un operador valido");
            break;
        }
    }
}