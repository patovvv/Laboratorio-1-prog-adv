package lab1;
import java.util.Scanner; // se importa la libreria para poder leer info

public class Lab1 {
    public static void main(String[] args) {
     
    //Creamos un objeto de la clase scanner *la que fue importada desde la libreria
    Scanner leer = new Scanner(System.in); // primero creamos el objeto y luego llamamos al constructor que se llama igual que el objeto
    
    //Ciclo while
    while (true){
        //try{
            
            System.out.println("Desea ingresar divisas?");
            System.out.println("1.Si   2.No");
            int pregunta = leer.nextInt(); 

            if (pregunta==1){
            //Leemos los datos
            
            System.out.println("Ingrese el monto a convertir");
            int monto = leer.nextInt(); // siempre poner que tipo de variable es

            //Creamos los objetos
            System.out.println("Ingrese el valor del dolar");
            int valor_d = leer.nextInt();
            Moneda Dolar = new Moneda(valor_d,"Dolar");

            System.out.println("Ingrese el valor del euro");
            int valor_e = leer.nextInt();
            Moneda Euro = new Moneda(valor_e,"Euro");

            System.out.println("Ingrese el valor del peso argentino");
            int valor_pa = leer.nextInt();
            Moneda Pesoa = new Moneda(valor_pa,"Pesos Argentinos");

            Dolar.calculo(monto);
            Euro.calculo(monto);
            Pesoa.calculo(monto);
            System.out.println(" ");
            
            }

            if (pregunta==2){
                System.out.println("Saliendo del sistema...");
                break;
        }
        
        //} catch(Exception e){
            
        }
        
    }
    }
   