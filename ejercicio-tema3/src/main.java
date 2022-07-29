public class main {
    public static void main(String[] args) {

        suma(10,20,30);

        Coche coche = new Coche();
        coche.incrementarPuertas();
        System.out.println(coche.numeroDePuertas+"Puerta");
    }

    public static int suma(int a, int b, int c){
        return a +b +c;
    }

}
class Coche{
     int numeroDePuertas;
    public void incrementarPuertas(){
        this.numeroDePuertas ++;
    }
}
