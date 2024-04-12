public class ejercicio6_tema3 {
    public static void main(String[] args) {

        // a), b)
        String universo  = "Estoy seguro de que el universo está lleno de vida inteligente. ";
        String gancho    = "Simplemente ha sido demasiado inteligente como para venir aquí";
        String fusion    = universo.concat(gancho);
        String texto     = universo + gancho;
        System.out.println();

        String substring = universo.substring(0,4);

        String TEXTO     = texto.toUpperCase();

        System.out.println(TEXTO);

        // c) no la hay, de hecho lo mejor es crear un stringbuffer según los apuntes.

    }
}
