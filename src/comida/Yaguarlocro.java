package comida;

public class Yaguarlocro extends ComidaEc{
    double precio;
    String ingredientes;
    public Yaguarlocro(String nom, String reg, double precio, String ingredientes){
        super(nom, reg);
        this.precio=precio;
        this.ingredientes=ingredientes;
    }
    public double getPrecio(){
        return precio;
    }
    public String getIngredientes(){
        return ingredientes;
    }
    @Override
    public void impDatos(){
        super.impDatos();
        System.out.println("Ingredientes: "+ getIngredientes());
        System.out.println("Precio: "+ getPrecio());
    }
}
