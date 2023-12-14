package deberPOOVehiculo;
public class Principal {
    public static void main(String[] args) {
        // Crear objeto de la clase Carro
        Carro carro1 = new Carro("ABC123", 4, "Toyota", "Rojo", "Sedán");
        carro1.encenderMotor();  // Método heredado de la clase Vehiculo
        carro1.encenderCalefactor();  // Método específico de la clase Carro
        carro1.imprimirDatos();  // Método propio de la clase Carro

        System.out.println();  // Separador entre los dos objetos

        // Crear objeto de la clase Moto
        Moto moto1 = new Moto("XYZ789", 2, "Honda", "Negro", 2);
        moto1.encenderMotor();  // Método heredado de la clase Vehiculo
        moto1.hacerAcrobacia();  // Método específico de la clase Moto
        moto1.imprimirDatos();  // Método propio de la clase Moto
    }
}
