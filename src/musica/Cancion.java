package musica;

public class Cancion extends Artista{
    protected String nomCancion;
    protected String duracion;

    public Cancion(String nomArt, String gen, String nomCancion, String duracion){
        super(gen, nomArt);
        this.nomCancion=nomCancion;
        this.duracion=duracion;
    }

    public String getNomCancion(){
        return nomCancion;
    }
    public String getDuracion(){
        return duracion;
    }

    @Override
    public void MostrarDatos(){
        System.out.println("---------------");
        System.out.println("Nombre Cancion: "+getNomCancion());
        System.out.println("Duracion: "+getDuracion());
        System.out.println("---------------");
        super.MostrarDatos();
    }
}
