public class Ingrediente {
    private String Nombre;
    private String Precio;

    public Ingrediente(String Nombre, String Precio) {
        this.Nombre = Nombre;
        this.Precio = Precio;
    }

    Ingrediente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNombre() {
        return Nombre;
    }

    public String getPrecio() {
        return Precio;
    }
    
    

}
