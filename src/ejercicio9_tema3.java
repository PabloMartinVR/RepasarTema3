import javax.swing.*;


public class ejercicio9_tema3 {
    public static void main(String[] args) {
        String metodo = JOptionPane.showInputDialog("Escribe");
        Contar(metodo);
    }

    /**
     *
     * @param leido Este se utiliza para usar el String que será introducido al método.
     */
    public static void Contar(String leido){

        int cont1=0, cont2=0, cont3=0, cont4=0, cont5=0, ii=0;
        char a='a',e='e',i='i',o='o',u='u';
        while (ii < leido.length()){

            if (a==leido.charAt(ii)){
                cont1++;
            }
            if (e==leido.charAt(ii)){
                cont2++;
            }
            if (i==leido.charAt(ii)){
                cont3++;
            }
            if (o==leido.charAt(ii)){
                cont4++;
            }
            if (u==leido.charAt(ii)){
                cont5++;
            }
            ii++;
        }

        if (cont1>5){
            System.out.println("Exceso de " + a);
        }else {
            System.out.println("La letra a aparece " + cont1 + " veces.");
        }
        if (cont2>5){
            System.out.println("Exceso de "+e);
        }else {
            System.out.println("La letra e aparece " + cont2 + " veces.");
        }
        if (cont3>5){
            System.out.println("Exceso de "+i);
        }else {
            System.out.println("La letra i aparece " + cont3 + " veces.");
        }if (cont4>5){
            System.out.println("Exceso de "+o);
        }else {
            System.out.println("La letra o aparece " + cont4 + " veces.");
        }
        if (cont5>5){
            System.out.println("Exceso de "+u);
        }else {
            System.out.println("La letra u aparece " + cont5 + " veces.");
        }
    }
}
