public class Main {
    public static void main(String[] args) {
        Coche micoche = new Coche();
        micoche.AgregarPuertas();
        System.out.println(micoche.puertas);
    }

    public static int trisuma(int a, int b, int c) {
        return a + b + c;
    }
}

class Coche {
    public int puertas = 0;
    public void AgregarPuertas() {
        this.puertas++;
    }
}