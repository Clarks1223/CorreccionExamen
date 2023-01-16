package musica;
public abstract class  Musica {
    protected String genero;
    public Musica (String genero){
        this.genero=genero;
    }
    public String getGenero() {
        return genero;
    }
    abstract void MostrarDatos();
}
