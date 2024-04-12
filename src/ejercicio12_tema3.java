import javax.swing.*;
import java.util.Scanner;

public class ejercicio12_tema3 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        int num = numero.nextInt();
        String leido = frase(num);
        System.out.println(leido);
    }
    public static String frase (int num){
        int numero = 0;
        StringBuffer devolver = new StringBuffer();
        for (int i = 0; i <= num; i++) {
            String pasa = String.valueOf(numero);
            devolver.append(pasa);
            numero++;
            devolver.append(" ");
        }
        String bala  = devolver.toString();
        String balas = bala.trim();
        return balas;
    }
}
