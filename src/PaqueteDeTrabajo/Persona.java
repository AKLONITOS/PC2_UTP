package PaqueteDeTrabajo;

public  class Persona {
    private String Nombres;
    private String Apellidos;
    private int  DNI;
    private String codigo;
    
    public Persona(){
        
    }

    public Persona(String Nombres, String Apellidos) {
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
    }
    
    public Persona(String Nombres, String Apellidos, int DNI, String codigo) {
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.DNI=DNI;
        this.codigo=codigo;
    }

    
    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String Codigo(){
    return getCodigo();
    };
    
}
