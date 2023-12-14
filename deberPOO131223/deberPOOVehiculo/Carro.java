package deberPOOVehiculo;
public class Carro extends Vehiculo {
    //atributos

    private String tipo ;
    //constructores

    public Carro(String tipo) {
        this.tipo = "";
    }

    public Carro(String numeroPlaca, int numeroRuedas, String marca, String color, String tipo) {
        super(numeroPlaca, numeroRuedas, marca, color);
        this.tipo = tipo;
    }
    
    //metodos

    public void encenderCalefactor(){

    System.out.println("Calefacto encendido, no nos vamos a congelar :) ");        
    }


       
    @Override
    public void apagarMotor() {
       
        super.apagarMotor();
    }
  @Override
    public void encenderMotor() {
        
        super.apagarMotor();
    }


    public void imprimirDatos() {
        System.out.println("Datos del Carro:");
        System.out.println("Número de Placa: " + getNumeroPlaca());
        System.out.println("Número de Ruedas: " + numeroRuedas);
        System.out.println("Marca: " + marca);
        System.out.println("Color: " + color);
        System.out.println("Tipo: " + tipo);
    }

}
