package musica;

public class Artista extends Musica{
    protected String nombre;
    public Artista(String nombre, String genero){
        super(genero);
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }
    @Override
    public void MostrarDatos(){
        System.out.println("Genero: "+getGenero());
        System.out.println("---------------------");
        System.out.println("Artista: "+getNombre());
        System.out.println("---------------------");
    }
}