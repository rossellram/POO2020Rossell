public class Receta implements Partes {

    private Integer Nombre;
    private String Tipo;

    public Receta(Integer Nombre, String Tipo) {
        this.Nombre = Nombre;
        this.Tipo = Tipo;
    }

    public Integer getNombre() {
        return Nombre;
    }

    public void setNombre(Integer Nombre) {
        this.Nombre = Nombre;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    
}
