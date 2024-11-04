package vehiculos;

public class FabricaMotocicleta extends FabricaVehiculos {
    @Override
    public Vehiculo crearVehiculo() {
        return new Motocicleta(); // Instancia de Motocicleta
    }
}
