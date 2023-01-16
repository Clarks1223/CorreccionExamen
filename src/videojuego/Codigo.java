package videojuego;

public class Codigo extends videojuegos{
    String lenguaje;
    public Codigo(String nombre, String genero, String lenguaje){
        super(nombre, genero);
        this.lenguaje=lenguaje;
    }
    public String getLenguaje(){
        return lenguaje;
    }
    @Override
    public void mostDatos(){
        super.mostDatos();
        System.out.println("Lenguaje de programacion: "+getLenguaje());
    }
}
