package vehiculos;

public class CocheBuilder {
    private String modelo;
    private String color;

    public CocheBuilder setModelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public CocheBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public Coche construir() {
        Coche coche = new Coche();
        coche.setModelo(modelo);
        coche.setColor(color);
        return coche; // Retorna un coche correctamente configurado
    }
}
