public class Main {
    public static void main(String[] args) {
        Sumar(12, 40, 27);

        miCoche coche1 = new miCoche();
        System.out.println(coche1.agregarPuerta());
    }

    public static void Sumar(int a, int b, int c) {
        int resultado = a + b + c;
    }

    public static class miCoche {
        private int nPuertas = 0;

        public int agregarPuerta() {
            nPuertas++;
            return nPuertas;
        }
    }

}