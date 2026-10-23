package es.daw.simpsonspring.model;

public record Personaje(String nombre,
                        String apellido,
                        int edad,
                        String ocupacion,
                        String lugar,
                        boolean principal
) {
    public static final int MAYORIA_EDAD = 18;

    public boolean esMenor() {
        return edad < MAYORIA_EDAD;
    }
    public String nombreCompleto() {
        return apellido.isBlank() ? nombre : nombre + " " + apellido;
    }
}