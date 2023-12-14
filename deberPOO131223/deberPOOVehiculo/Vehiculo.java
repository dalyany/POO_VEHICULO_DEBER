package deberPOOVehiculo;
public class Vehiculo{

    //atributos
    //3 default 1private

    private String numeroPlaca;

    int numeroRuedas;
     String marca;
    String color; 
    

    //constructores 

    
    //constructor por defecto
    public Vehiculo(){
        this.numeroPlaca="";
        this.numeroRuedas=0;
        this.marca="";
        this.color="";

    }

      public Vehiculo(String numeroPlaca, int numeroRuedas, String marca, String color) {
        this.numeroPlaca = numeroPlaca;
        this.numeroRuedas = numeroRuedas;
        this.marca = marca;
        this.color = color;
    }


    //metodos

  




    public String getNumeroPlaca() {
        return numeroPlaca;
    }




    public void setNumeroPlaca(String numeroPlaca) {
        this.numeroPlaca = numeroPlaca;
    }




    public void encenderMotor()
    {
        System.out.println("Vehiculo encendido");
    }

    public void apagarMotor()
    {
        System.out.println("Vehiculo apagado");
    }

}