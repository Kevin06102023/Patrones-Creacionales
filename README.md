# Patrones Creacionales en Java

Este proyecto implementa varios patrones de diseño creacionales en Java, incluyendo Singleton, Factory Method, Builder y Prototype. A través de estas implementaciones, se demuestra cómo estos patrones pueden facilitar la creación y gestión de objetos en una aplicación.

## Patrones Implementados

### 1. Patrón Singleton
- **Clase `Configuracion`**: Asegura que solo haya una única instancia de configuración en toda la aplicación.
  package configuracion;

  public class Configuracion {
      private static Configuracion instancia;
      private String config;

      private Configuracion() {
          config = "Configuración del sistema";
      }

      public static Configuracion getInstancia() {
          if (instancia == null) {
              instancia = new Configuracion();
          }
          return instancia;
      }

      public String getConfig() {
          return config;
      }
  }
2. Patrón Factory Method
Clase abstracta FabricaVehiculos: Define el método abstracto crearVehiculo que será implementado por las fábricas concretas.

Clases concretas: FabricaCoche y FabricaMotocicleta crean instancias de Coche y Motocicleta, respectivamente.

package vehiculos;

public abstract class FabricaVehiculos {
    public abstract Vehiculo crearVehiculo();
}

public class FabricaCoche extends FabricaVehiculos {
    @Override
    public Vehiculo crearVehiculo() {
        return new Coche();
    }
}

public class FabricaMotocicleta extends FabricaVehiculos {
    @Override
    public Vehiculo crearVehiculo() {
        return new Motocicleta();
    }
}
3. Patrón Builder
Clase CocheBuilder: Permite construir un objeto Coche paso a paso.

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
        return coche;
    }
}
4. Patrón Prototype
Interfaz PrototypeVehiculo: Define el método clonar.

Clase Coche: Implementa PrototypeVehiculo y el método clonar para crear copias de un objeto Coche.

package vehiculos;

public interface PrototypeVehiculo {
    PrototypeVehiculo clonar();
}

public class Coche extends Vehiculo implements PrototypeVehiculo {
    private String modelo;
    private String color;

    public Coche() {}

    public Coche(String modelo, String color) {
        this.modelo = modelo;
        this.color = color;
    }

    @Override
    public Coche clonar() {
        return new Coche(this.modelo, this.color);
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
5. Clase Motocicleta
Clase Motocicleta: Implementa Vehiculo y proporciona su propia implementación de mostrarInfo.

package vehiculos;

public class Motocicleta extends Vehiculo {
    @Override
    public void mostrarInfo() {
        System.out.println("Soy una motocicleta.");
    }
}
6. Clase Abstracta Vehiculo
Clase Vehiculo: Base para los vehículos, define el método abstracto mostrarInfo.

package vehiculos;

public abstract class Vehiculo {
    public abstract void mostrarInfo();
}
7. Clase Principal Main
Ejemplo de uso de los patrones: Muestra cómo se utilizan los diferentes patrones creacionales.

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
        coche.mostrarInfo(); // "Soy un coche. Modelo: Sedán, Color: Rojo"

        // Factory Method para Motocicleta
        FabricaVehiculos fabricaMotocicleta = new FabricaMotocicleta();
        Vehiculo motocicleta = fabricaMotocicleta.crearVehiculo();
        motocicleta.mostrarInfo(); // "Soy una motocicleta."

        // Builder
        CocheBuilder builder = new CocheBuilder();
        Coche miCoche = builder.setModelo("Sedán").setColor("Rojo").construir();
        miCoche.mostrarInfo(); // "Soy un coche. Modelo: Sedán, Color: Rojo"

        // Prototype
        Coche cocheClonado = miCoche.clonar();
        cocheClonado.mostrarInfo(); // "Soy un coche. Modelo: Sedán, Color: Rojo"
    }
}
Resumen
Cada patrón de diseño que implementamos tiene su propósito:

Singleton: Asegura una única instancia de configuración.
Factory Method: Facilita la creación de diferentes tipos de vehículos sin acoplar el código a las clases concretas.
Builder: Proporciona una forma flexible de construir objetos complejos.
Prototype: Permite la creación de copias de objetos existentes sin necesidad de conocer su clase exacta.
Cómo Ejecutar el Proyecto
Asegúrate de tener Java y Maven (si es necesario) instalados en tu máquina.

Clona este repositorio:
git clone https://github.com/Kevin06102023/Patrones-Creacionales.git

Abre el proyecto en IntelliJ IDEA.

Ejecuta la clase Main para ver los patrones en acción.
