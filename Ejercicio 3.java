public class Main {

    
    public static void main(String[] args) {
        int resultado;
        resultado =suma(7, 4, 3);

        System.out.println(resultado);
    }
    
    public static int suma(int a, int b, int c) {
        return a + b + c;
    }

    public static void main (String [] args) {
        Coche miCoche = new Coche();
        miCoche.AgregarPuertas();
        miCoche.AgregarPuertas();
        miCoche.AgregarPuertas();
        System.out.println(miCoche.puertas); 
    }

    public static int suma (int a, int b) {
        return a + b;
    }
}

class Coche {
    public int puertas = 0;

    public void AgregarPuertas () {
        this.puertas++;
    }
}