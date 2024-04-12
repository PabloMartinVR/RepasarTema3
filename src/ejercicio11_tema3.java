import java.util.Scanner;

public class ejercicio11_tema3 {
    public static void main(String[] args) {
        Scanner anonac = new Scanner(System.in);
        System.out.print("Año de nacimiento: ");
        Scanner anoact = new Scanner(System.in);
        int nac  = anonac.nextInt();
        System.out.print("Año actual: ");
        int act  = anoact.nextInt();
        int edad = act-nac;
        StringBuffer frase = new StringBuffer();
        String tener = "Tienes ";
        String textoedad = String.valueOf(edad);
        String años = " años";
        frase.append(tener);
        frase.append(textoedad);
        frase.append(años);
        System.out.println(frase);
    }
}
