public class Persona {

    private String NombreCompleto;
    private String Direccion;
    private String Id;

    public Persona(String NombreCompleto, String Direccion, String Id) {
        this.NombreCompleto = NombreCompleto;
        this.Direccion = Direccion;
        this.Id = Id;
    }

    public String getNombreCompleto() {
        return NombreCompleto;
    }

    public void setNombreCompleto(String NombreCompleto) {
        this.NombreCompleto = NombreCompleto;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }
    
    
}
