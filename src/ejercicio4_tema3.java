import javax.swing.*;

public class ejercicio4_tema3 {
    public static void main(String[] args) {
        String frase1 = JOptionPane.showInputDialog("Frase 1");
        String frase2 = JOptionPane.showInputDialog("Frase 2");
        int comparar = frase1.compareTo(frase2);

        if (comparar > 0){
            System.out.println("Tecleadas "+frase1+" y "+ frase2);
            System.out.println("En orden "+frase2+" y "+ frase1);
        }

        if (comparar < 0){
            System.out.println("Tecleadas "+frase1+" y "+ frase2);
            System.out.println("En orden "+frase1+" y "+ frase2);
        }


        // Esto funciona de la siguiente manera, lo que hace es que si comparas la frase1 con la frase2 pues si están en orden pues obtienes −1, pero si no están en orden obtienes un 1 esto puede ser útil, porque ya si lo comparas con dicho valor puedes saber si está ordenado o no.

    }
}
