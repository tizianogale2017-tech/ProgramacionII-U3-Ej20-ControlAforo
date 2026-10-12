package Ejercicio20_controlAforo;

public class Main {
    public static void main(String[] args) {
        ControlAforo evento = new ControlAforo(5);

        for (int i = 1; i <= 7; i++) {
            boolean admitido = evento.registrarIngreso();
            System.out.println("Persona " + i + ": " + (admitido ? "ADMITIDA" : "RECHAZADA (evento completo)")
                    + " - asistentes: " + evento.getAsistentesActuales());
        }

        evento.registrarSalida();
        evento.registrarSalida();
        System.out.println("Salen 2 personas -> asistentes: " + evento.getAsistentesActuales());
        System.out.println("Persona 8: " + (evento.registrarIngreso() ? "ADMITIDA" : "RECHAZADA") + " - asistentes: " + evento.getAsistentesActuales());
    }
}
