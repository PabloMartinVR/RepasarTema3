import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class ejercicio7_tema3 {
    public static void main(String[] args) {

        Scanner pala   = new Scanner(System.in);
        System.out.print("Tecleado: ");
        String palabra = pala.nextLine();
        float divide      = (float) palabra.length()/2;
        String palabra1, palabra2;
        if (palabra.length()%2!=0){
            divide=divide+1;
            palabra1 = palabra.substring(0,(int)divide);
            palabra2 = palabra.substring((int)divide);
            System.out.println(palabra1+" | "+palabra2);
        }else {
            palabra1 = palabra.substring(0,(int)divide);
            palabra2 = palabra.substring((int)divide);
            System.out.println(palabra1+" | "+palabra2);
        }
        System.out.println(divide);

        // String palabra1 = palabra.substring()

    }
}
