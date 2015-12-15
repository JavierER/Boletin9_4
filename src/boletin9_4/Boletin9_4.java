package boletin9_4;

import javax.swing.JOptionPane;

/**
 *
 * @author Javii
 */
public class Boletin9_4 {

    
    public static void main(String[] args) {
    int num;
    num = Integer.parseInt(JOptionPane.showInputDialog("Numero:"));
    while (num!=0){
        for (int i=1; i<=10; i++){
        JOptionPane.showMessageDialog(null,num+" x "+ i);
    }
        num = Integer.parseInt(JOptionPane.showInputDialog("Teclea un Numero:"));
    }
    }
    
}
