public class Main {
    public static void main(String[] args) {
        int numeroIf = 20;
        int numeroWhile = 10;
        int numeroFor = 0;
        String estacion = "verano";

        if(numeroIf > 0){
            System.out.println("El número es positivo");
        }else{
            System.out.println("El número es negativo");
        }

        while (numeroWhile<3) {
            numeroWhile ++;
            System.out.println(numeroWhile);
        }

        do{
            numeroWhile++;
            System.out.println(numeroWhile);
        }while(numeroWhile <3);

        for (int i = 0; i<3; i ++){
            numeroFor++;
            System.out.println(numeroFor);
        }

        switch (estacion){
            case "verano":
                System.out.println("Es Verano");
                break;
            case "otoño":
                System.out.println("Es otoño");
                break;
            case "invierno":
                System.out.println("Es Invierno");
                break;
            case "primavera":
                System.out.println("Es Privera");
                break;

            default:
                System.out.println("Opción incorrecta");
        }
    }
}