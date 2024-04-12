import javax.swing.*;

public class ejercicio3_tema3 {
    public static void main(String[] args) {
        String frase1  = JOptionPane.showInputDialog("Frase1");
        String frase2  = JOptionPane.showInputDialog("Frase2");

        String gancho  = "ni siquiera tienen la misma longitud";
        String opcion1 = "(la primera tiene más caracteres)";
        String opcion2 = "(la segunda tiene más caracteres)";

        int    log1    = frase1.length();
        int    log2    = frase2.length();

        // a) y b)
        if (!frase1.equals(frase2) && log1==log2){
            System.out.println("No son exactamente iguales");
            System.out.println("pero la longitud es la misma");
            System.out.println("y serían iguales si no tenemos en cuenta las mayúsculas/minúsculas");
        }

        if (!frase1.equals(frase2) && log1!=log2){
            System.out.println("No son exactamente iguales");
            if (log1>log2){
                System.out.println(gancho+" "+opcion1);
            }else {
                System.out.println(gancho+" "+opcion2);
            }
        }



    }
}
