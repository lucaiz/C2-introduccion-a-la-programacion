public class 4.2-clase-Main {
    public static void main(String[] args) {
        int contador = 10;

        while (contador > 0) {
            System.out.println(contador);
            contador--;
        }

        int contador = 10;
        do {
            System.out.println(contador);
            contador = contador - 1;
        } while (contador > 10); 
    }
}
// El bucle do-while primero ejecuta el codigo y dsp evalua la condicion y depende del resultado
// lo hara denuevo o seguira el codigo. De esta forma SIEMPRE existe al menos una ejecucion.
// Entoncesm un do-while tendra una ejecucion menos. 