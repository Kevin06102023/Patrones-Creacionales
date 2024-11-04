package vehiculos;

// Configuracion.java
public class Configuracion {
    private static Configuracion instancia;

    private Configuracion() {
        // Inicialización
    }

    public static Configuracion getInstancia() {
        if (instancia == null) {
            instancia = new Configuracion();
        }
        return instancia;
    }

    public String getConfig() {
        return "Configuración del sistema";
    }
}

