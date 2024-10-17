package PaqueteDeTrabajo;

public class Profesor_1 extends Persona{
    private String Curso;

    public Profesor_1(String Curso, String Nombres, String Apellidos) {
        super(Nombres, Apellidos);
        this.Curso = Curso;
    }

    public Profesor_1(String Curso, String Nombres, String Apellidos, int DNI, String codigo) {
        super(Nombres, Apellidos, DNI, codigo);
        this.Curso = Curso;
    }
    
    

    public Profesor_1(){
    }
    
    public String getCurso() {
        return Curso;
    }

    public void setCurso(String Curso) {
        this.Curso = Curso;
    }
    
    
    @Override
   public String Codigo() {
      return "P"+getCodigo();
    }

    
    }
    


