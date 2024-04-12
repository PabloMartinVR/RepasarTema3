
public class ejercicio10_tema3 {
    public static void main(String[] args) {
        String  frasess   = "Dabale arroz a la zorra el abad";
        String  frases    = frasess.trim();
        String  frase     = frases.replace(" ","");
        String  finall    = frase.toLowerCase();
        System.out.println(finall);

        StringBuilder cash = new StringBuilder();
        cash.append(finall);
        cash.reverse();
        System.out.println(cash);
        String ya = cash.toString();

        if (ya.equals(finall)){
            System.out.println("Si es");
        }else {
            System.out.println("No es");
        }


    }
}
