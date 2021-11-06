package classroom;

public class Persona {

    long cedula; //se elimino el atributo final
    String nombre;
    static int totalPersonas;

    static {
        totalPersonas = 0;
        //se elimino el atributo cedula
    }

    //se agrega el constructor sin argumentos

    Persona(){

    }

    Persona(long cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }
    
    Persona(String nombre, long cedula) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }

    Persona(long cedula) {
        this.cedula = cedula;
        this.nombre = "";
        totalPersonas++;
    }

    Persona(String nombre) {
        this.nombre = "";
        totalPersonas++;
        this.cedula = 1;
    }
    
    public long getCedula() {
        return cedula;
    } //se agrego public

    public String getNombre() {
        return nombre;
    } //se agrego public

    public void setNombre(String nombre) {
        this.nombre = nombre;
    } //se agrego public
}
