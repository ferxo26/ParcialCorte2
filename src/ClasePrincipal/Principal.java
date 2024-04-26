
package ClasePrincipal;
import java.util.Scanner;

public class Principal {
 
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        int opcion;
        
        do{
                System.out.println("\"***CONCESIONARIO CAUCANA DE VEHICULOS S.A***");
                System.out.println("***REGISTRO DE VEHICULOS VENDIDOS***");
                System.out.println("1. Registro de automoviles");
                System.out.println("2. Registro de motos");
                System.out.println("3. Vendedor");
                System.out.println("4. Salir");
                System.out.println("Ingrese una opcion:");
                opcion = scanner.nextInt();
                
        switch (opcion){
            
            case 1: registrarAutomovil();
            break;
            
            case 2: registrarMoto();
            break;
            
            case 3: System.out.println("Vendedor: Nombre y Apellido");
            break;
            
            case 4:System.out.println("!Has salido del programa,vuelve pronto!");
            break; 

            default : System.out.println("Por favor , selecciona una opcion valida.");
        }   
        
        }while(opcion!=4);
         scanner.close ();
    } 
    
        public static void registrarAutomovil(){
        Scanner scanner = new Scanner(System.in);
            System.out.println("Registar automovil");
            System.out.println("Registrar placa");
            String placa = scanner.nextLine();
            System.out.println("Ingrese el modelo");
            int modelo = scanner.nextInt();
            System.out.println("Ingrese el precio : ");
            double precio = scanner.nextDouble();
            
        Automovil automovil = new Automovil(placa, modelo, precio);
            System.out.println("Los datos del automvil son:");
            System.out.println("Placa:" + automovil.getPlaca());
            System.out.println("Modelo:" + automovil.getModelo());
            System.out.println("Precio:" + automovil.getPrecio());
            
       scanner.close();}
       
        public static void registrarMoto(){
        Scanner scanner = new Scanner(System.in);
            System.out.println("Registar moto");
            System.out.println("Registrar placa");
            String placa = scanner.nextLine();
            System.out.println("Ingrese el modelo: ");
            int modelo = scanner.nextInt();
            System.out.println("Ingrese el cilindraje: ");
            double precio = scanner.nextDouble();
            
        Moto moto = new Moto(placa, modelo, modelo);
            System.out.println("Los datos del automvil son:");
            System.out.println("Placa:" + moto.getPlaca());
            System.out.println("Modelo:" + moto.getModelo());
            System.out.println("Cilindraje:" + moto.getCilindraje());
            
        scanner.close();}    
            
}          
            
             
            
            
          
            
    
    