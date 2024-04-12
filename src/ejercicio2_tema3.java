public class ejercicio2_tema3 {
    public static void main(String[] args) {
        // a)
        String texto = "Estoy seguro de que el universo está lleno de vida inteligente";

        // b)
        int longitud = texto.length();   // Sirve para devolver en formato números la cantidad de letras que hay en un string.

        // c)
        char primero     = texto.charAt(0);  // charAt sirve para devolver cuál es el carácter que hay en determinada posición.
        char posicion23  = texto.charAt(23);
        char ultimo      = texto.charAt(texto.length()-1);
        System.out.println();

        // d)
        int posicionY    = texto.indexOf('y'); // indexOf sirve para devolver cuál es la posición que ocupa una cadena
        System.out.println(posicionY);

        // e)
        boolean loes     = texto.startsWith("Estoy"); // startsWith se utiliza para comprobar si es verdadero que las palabras del inicio coincide con lo que hay entre comillas del Star witch.
        System.out.println(loes);

    }
}