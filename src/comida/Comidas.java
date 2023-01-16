package comida;

public abstract class Comidas {
    private String nombre;
    public Comidas(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public abstract void impDatos();
}