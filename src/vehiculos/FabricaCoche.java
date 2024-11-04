package vehiculos;

public class FabricaCoche extends FabricaVehiculos {
    @Override
    public Vehiculo crearVehiculo() {
        return new Coche(); // Instancia de Coche
    }
}
