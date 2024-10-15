

public class Perrito{
    //constructor -> inicializador
    Perrito(String razaParametro){
        this.raza = razaParametro;
        // this -> es la referencia al mismo objeto.
    }
    //atributos -> caracterísitcas
    // color, tamaño, raza, sexo
    private String nombreClase; // "Beto"
    String colorPelo;
    Boolean sexo; // false -> macho; 1 -> true
    Boolean vacunadoRabia;
    public String raza;
    String armas;

    //métodos -> acciones
    // CREAR UN MÉOTODO SET
    public void setNombre(String nombre){
       this.nombreClase = nombre;
    }
    // CREAR UN MÉTODO GET
    public String getNombre(){
        return this.nombreClase;
    }
}
