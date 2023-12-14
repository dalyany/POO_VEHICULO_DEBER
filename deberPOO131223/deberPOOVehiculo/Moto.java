package deberPOOVehiculo;
public class Moto extends Vehiculo {
    //atributos

    private int numeroAlerones; 
    //constructores

    public Moto(String numeroPlaca, int numeroRuedas, String marca, String color, int numeroAlerones) {
        super(numeroPlaca, numeroRuedas, marca, color);
        this.numeroAlerones = numeroAlerones;
    }

    //metodos
    
    public void hacerAcrobacia(){

        System.out.println("derrapando con mi moto! jiha!!!");
    }

    //metodos heredados y sobreescritos
    @Override
    public void apagarMotor() {
       
        super.apagarMotor();
    }
  @Override
    public void encenderMotor() {
        
        super.apagarMotor();
    }


    public void imprimirDatos() {
        System.out.println("Datos del Moto:");
        System.out.println("Número de Placa: " + getNumeroPlaca());
        System.out.println("Número de Ruedas: " + numeroRuedas);
        System.out.println("Marca: " + marca);
        System.out.println("Color: " + color);
        System.out.println("Número de alerones: " + numeroAlerones);
    }
}
