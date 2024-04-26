
package ClasePrincipal;


public class Sport extends Moto {
    
   private String motor;
   private String potencia;
   private String tanque;

    public Sport(String motor, String potencia, String tanque, String placa, int modelo, int cilindraje) {
        super(placa, modelo, cilindraje);
        this.motor = motor;
        this.potencia = potencia;
        this.tanque = tanque;
    }

    
    public String getMotor() {
        return motor;
    }

    public String getPotencia() {
        return potencia;
    }

    public String getTanque() {
        return tanque;
    }
    
    public String motorgarantia(){
        if(motor.equals("4Tiempos")){
            return "La garantia de la moto es por 2años";
    } else if (motor.equals("Monocilindrico")){
        return "La garantia de la moto es por 1año";
    } else {
        return "Tipo de motor desconocido";
    }
    }
       
}
