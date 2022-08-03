public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.setEdad(28);
        persona.setNombre("Pierre");
        persona.setTelefono(26165114923L);

        System.out.println("Edad:  " + persona.getEdad());
        System.out.println("Nombre: "+persona.getNombre());
        System.out.println("Teleono: "+persona.getTelefono());
    }

    public static class Persona {
        private int edad;
        private String nombre;
        private long telefono;

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public long getTelefono() {
            return telefono;
        }

        public void setTelefono(long telefono) {
            this.telefono = telefono;
        }
    }
}


