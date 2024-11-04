package vehiculos;

public class Coche extends Vehiculo implements PrototypeVehiculo {
    private String modelo;
    private String color;

    public Coche() {
        // Constructor vacío
    }

    public Coche(String modelo, String color) {
        this.modelo = modelo;
        this.color = color;
    }

    @Override
    public Coche clonar() {
        return new Coche(this.modelo, this.color); // Retornar un nuevo Coche con los atributos
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Soy un coche. Modelo: " + modelo + ", Color: " + color);
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
