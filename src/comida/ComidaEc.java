package comida;
public class ComidaEc extends Comidas{
    private String region;
    public ComidaEc(String region, String nombre){
        super(nombre);
        this.region=region;
    }

    public String getRegion(){
        return getRegion();
    }
    @Override
    public void impDatos(){
        System.out.println("Nombre: "+getNombre());
        System.out.println("Region: "+getRegion());
    }
}