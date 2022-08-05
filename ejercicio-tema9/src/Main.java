public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setEdad(12);
        cliente.setNombre("pepe");
        cliente.setCredito("credito1");
        cliente.setTelefono(2616114923L);
        System.out.println(cliente.getEdad());
        System.out.println(cliente.getNombre());
        System.out.println(cliente.getCredito());

        Trabajador trabajador = new Trabajador();
        trabajador.setEdad(58);
        trabajador.setNombre("Juan");
        trabajador.setTelefono(594785626L);
        trabajador.setSalario(200000.00);

        System.out.println(trabajador.getEdad());
        System.out.println(trabajador.getNombre());
        System.out.println(trabajador.getTelefono());
        System.out.println(trabajador.getSalario());

    }

}
