
package empleado;
import java.time.LocalDate;
import java.time.Period;


public class Empleado {
    private String dni;
    private String nombre;
    private String apellido;
    private String domicilio;
    private LocalDate fechaDeNacimiento;
    private double sueldoBruto;
    
    public Empleado(String dni,String nombre,String apellido,String domicilio,LocalDate fechaDeNacimiento,double sueldoBruto){
       this.dni = dni;
       this.nombre = nombre;
       this.apellido = apellido;
       this.domicilio = domicilio;
       this.fechaDeNacimiento = fechaDeNacimiento;
       this.sueldoBruto = sueldoBruto;
    }
    
    int calcularEdad(){
       LocalDate fechaActual = LocalDate.now();
       return Period.between(fechaDeNacimiento, fechaActual).getYears();
    }
    public void mostrarDatos(){
        System.out.println("DNI:" +dni);
        System.out.println("NOMBRE: "+nombre);
        System.out.println("APELLIDO: "+apellido);
        System.out.println("DOMICILIO: "+domicilio);
        System.out.println("FECHA DE NACIMIENTO: "+fechaDeNacimiento);
        System.out.println("SUELDO BRUTO: "+sueldoBruto);
        System.out.println("EDAD: "+calcularEdad());
    }
    public static void main(String[] args) {
       Empleado empleado1 = new Empleado("12323123", "Jops", "stefan", "Calle falsa 11", LocalDate.of(1990, 5, 15), 2500);
       Empleado empleado2 = new Empleado("551168", "Eaus", "NoStefan", "cALLE Falsa 22", LocalDate.of(1989 , 6, 16), 3000);
       Empleado empleado3 = new Empleado("779955", "Joel", "DefiniNoStefan", "Calle no falsa 33", LocalDate.of(1997, 01, 29), 4500);
       
        System.out.println("Datos del empleado 1: ");
        empleado1.mostrarDatos();
        
        System.out.println("Datos del empleado 2: ");
        empleado2.mostrarDatos();
        
        System.out.println("Datos del empleado 3: ");
        empleado3.mostrarDatos();
    }
    
}
