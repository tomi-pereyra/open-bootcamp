public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int numeroIf = 0;
        if(numeroIf < 0) {
            System.out.println("Es negativo");
        } else if(numeroIf > 0) {
            System.out.println("Es positivo");
        } else {
            System.out.println("Es cero");
        }

        int numeroWhile = 0;
        while(numeroWhile < 3) {
            System.out.println(++numeroWhile);
        }


        do{
            System.out.println(++numeroWhile);
        } while(false);


        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        String estacion = "verano";
        switch (estacion) {
            case "verano":
                System.out.println("Es Verano");
                break;
            case "otoño":
                System.out.println("Es Otoño");
                break;
            case "invierno":
                System.out.println("Es Invierno");
                break;
            case "primavera":
                System.out.println("Es Primavera");
                break;
            default:
                System.out.println("No es una estación");
                break;
        }
    }
}