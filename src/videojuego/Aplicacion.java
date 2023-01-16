package videojuego;

public abstract class Aplicacion {
    private String nombre;
    public Aplicacion(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public abstract void mostDatos();
}