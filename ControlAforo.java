package Ejercicio20_controlAforo;

public class ControlAforo {
    private int capacidadMaxima;
    private int asistentesActuales;

    public ControlAforo(int capacidadMaxima) {
        if (capacidadMaxima <= 0) {
            throw new IllegalArgumentException("La capacidad debe ser mayor a cero.");
        }
        this.capacidadMaxima = capacidadMaxima;
        this.asistentesActuales = 0;
    }

    public boolean registrarIngreso() {
        if (asistentesActuales >= capacidadMaxima) {
            return false;
        }
        asistentesActuales++;
        return true;
    }

    public void registrarSalida() {
        if (asistentesActuales > 0) {
            asistentesActuales--;
        }
    }

    public int getAsistentesActuales() {
        return asistentesActuales;
    }
}
