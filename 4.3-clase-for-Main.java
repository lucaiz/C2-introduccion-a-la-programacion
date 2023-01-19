public class 4.3-clase-for-Main {
    public static void main(String[] args) {
        //  Los 3 bloques descritos aca abajo son opcionales.
        //  (INICIALIZACION,   COMPARACION,   ACCION(siempre al final del codigo definido) )
        for (int contador = 1; contador <=10; contador++) {
            System.out.println(contador);
        }


        // Para recorrer un array seria:
        int valores[] = {10, 20, 30, 40, 50};

        for (int i = 0; i < valores.length; i++) {
            System.out.println(valores[i]);
        }
        // A su vez es equivalente a este planteamiento.
        for (int i : valores) {
            System.out.println(valores[i]);
        }
    }
}
// Por ejemplo una verificacion equivalente a un While que chequee la temperatura seria:
// for ( ;temperatura <= 35; ) {      no se requiere ni de inicializacion ni de accion.