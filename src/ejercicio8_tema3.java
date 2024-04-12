import javax.swing.*;

public class ejercicio8_tema3 {
    public static void main(String[] args) {
        String leer  = JOptionPane.showInputDialog("escribe una palabra");
        int i=0;
        int cont1=0;
        int cont2=0;

        char a   ='a';
        char b   ='b';
        while(i<leer.length()){
            if (a==leer.charAt(i)){
                cont1++;
            }
            if (b==leer.charAt(i)){
                cont2++;
            }
            i++;
        }

        System.out.println("La letra a aparece "+cont1+" veces.");
        System.out.println("La letra a aparece "+cont2+" veces.");

    }
}
