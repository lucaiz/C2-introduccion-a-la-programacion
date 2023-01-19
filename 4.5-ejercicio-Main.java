public class 4.5-ejercicio-Main {
    public static void main(String[] args) {
        // Verificacion de que el numero es Neg, 0 o Pos.
        int numerolf = 5;

        if (numerolf < 0) {
            System.out.println("'numerolf' es Negativo.");
        } else if (numerolf = 0) {
            System.out.println("'numerolf' equivale a 0");
        } else {
            System.out.println("'numerolf' es Positivo");
        }

        // While siempre que 'contador' < 3
        int numero = -2;
        
        while (numero < 3) {
            System.out.println(numero);
            numero++;
        }

        // Estructura do-while
        int numero = 0;

        do {
            System.out.println("Mi valor es", numero);
            numero++;
        } while (numero < 1);

        // Bucle 'for'
        for (numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        // Switch de estaciones
        var estacion = "verano";
        
        switch (estacion) {
            case estacion == "verano":
            System.out.println("Ahora es verano.");
            break;
        case estacion == "primavera":
            System.out.println("Ahora es primavera");
            break;
        case estacion == "invierno": 
            System.out.println("Ahora es invierno");
            break;
        case estacion == "otono":
            System.out.println("Ahora es otono");
            break;
        default:
            System.out.println("'estacion' no hace referencia a ninguna estacion.");
        }
    }
}
