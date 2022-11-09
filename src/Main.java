public class Main {
    public static void main(String[] args) {
        Empleado p = new Empleado("Pepe Pérez", new Date(90, Calendar.FEBRUARY, 1));
        System.out.println(p);

        p.nombre = "Otro nombre";  // TODO: el nombre del empleado no debería poderse cambiar (debe ser inmutable)

    }


}