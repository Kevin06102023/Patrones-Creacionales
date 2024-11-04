package vehiculos;

public class Main {
    public static void main(String[] args) {
        // Singleton
        Configuracion config = Configuracion.getInstancia();
        System.out.println(config.getConfig());

        // Factory Method para Coche
        FabricaVehiculos fabricaCoche = new FabricaCoche();
        Coche coche = (Coche) fabricaCoche.crearVehiculo();
        coche.setModelo("Sedán");
        coche.setColor("Rojo");
        coche.mostrarInfo(); // Esto debe mostrar "Soy un coche. Modelo: Sedán, Color: Rojo"

        // Factory Method para Motocicleta
        FabricaVehiculos fabricaMotocicleta = new FabricaMotocicleta();
        Vehiculo motocicleta = fabricaMotocicleta.crearVehiculo();
        motocicleta.mostrarInfo(); // Debe mostrar "Soy una motocicleta."

        // Builder
        CocheBuilder builder = new CocheBuilder();
        Coche miCoche = builder.setModelo("Sedán").setColor("Rojo").construir();
        miCoche.mostrarInfo(); // Esto debe mostrar "Soy un coche. Modelo: Sedán, Color: Rojo"

        // Prototype
        Coche cocheClonado = miCoche.clonar(); // Clonación
        cocheClonado.mostrarInfo(); // Esto debe mostrar "Soy un coche. Modelo: Sedán, Color: Rojo"
    }
}
