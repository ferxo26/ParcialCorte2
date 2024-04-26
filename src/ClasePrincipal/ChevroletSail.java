
package ClasePrincipal;


public class ChevroletSail extends Sedan {
    
    private String tanque;
    private boolean seguro;

    public ChevroletSail(String tanque, boolean seguro, double motor, boolean frenos, String placa, int modelo, double precio) {
        super(motor, frenos, placa, modelo, precio);
        this.tanque = tanque;
        this.seguro = seguro;
    }
    
    public String seguro(){
        if (seguro){
            return "El automovil tiene seguro todo riesgo";
        } else{
            return "El automvil no tiene seguro todo riesgo";
        }
    }
    public String precioSeguro(){
        if(getPrecio()>50000000){
            double valorSeguro = getPrecio()*0.1;
            return "El valor del seguro es :"+ valorSeguro;
           
        } else {
            return "No hay valor del seguro puesto que el valor del automvil es menor a $50.000.000";
        }
    }
    
    
    
}
