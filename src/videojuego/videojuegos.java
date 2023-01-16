package videojuego;

public class videojuegos extends Aplicacion{
    private String genero;
    public videojuegos(String nombre, String genero){
        super(nombre);
        this.genero=genero;
    }
    public String getGenero(){
        return genero;
    }
    @Override
    public void mostDatos(){
        System.out.println("Nombre: "+getNombre());
        System.out.println("Genero: "+getGenero());
    }
}