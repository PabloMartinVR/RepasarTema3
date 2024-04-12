import javax.swing.*;

public class ejercicio5_tema3 {
    public static void main(String[] args) {
        String leer    = JOptionPane.showInputDialog("Leer");
        String cambion = leer.replace('a','*');
        System.out.println(cambion);
    }
}
