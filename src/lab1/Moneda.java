package lab1;
public class Moneda {
    //inicializamos los atributos
    private int valor;
    private String nombre;

    public Moneda(int valor, String nombre) {
        this.valor = valor;
        this.nombre = nombre;
    }

    public int getValor() {
        return valor;}
    public String getNombre() {
        return nombre;}

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void calculo(int monto){
        float total=monto/valor;
        System.out.println(monto+ " pesos son " + total+" "+ nombre);
    }
}
    

/*para crear el construcor, get y set 
  le das clic derecho
  insert code 
  y le das a la opcion que quieras
*/