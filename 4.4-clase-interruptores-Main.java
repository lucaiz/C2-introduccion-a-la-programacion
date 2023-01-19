public class 4.4-clase-interruptores-Main {
    
    // Los interruptores pueden considerarse como 'ifs' solo que hacen verificaciones
    // True sobre la variable que le damos. En la condicion TRUE entraran y ejecutara
    // todos los casos siguientes sin importar la condicion  por lo que realmente 
    // para solo ejecutar el caso  que se cumple al final de cada 'case' metemos un 'break'.
    public static void main(String[] args) {
        var estacion = "VERANO";

        switch(estacion) {
            case "VERANO":
                System.out.println("Es verano");
                break;
            case "INVIERNO":
                System.out.println("Es invierno");
                break;
            default: // 'default' es opcional
                System.out.println("Otra estacion");    
        }   
    }
}
