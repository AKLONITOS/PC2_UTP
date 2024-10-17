package PaqueteDeTrabajo;

public class Alumno extends Persona{
    private String Bimestre;
    private String Nota1;
    private String Nota2;
    private String Nota3;
    //prueva

    public Alumno(String Bimestre, String Nota1, String Nota2, String Nota3, String Nombres, String Apellidos, int DNI, String codigo) {
        super(Nombres, Apellidos, DNI, codigo);
        this.Bimestre = Bimestre;
        this.Nota1 = Nota1;
        this.Nota2 = Nota2;
        this.Nota3 = Nota3;
    }

    

    public String getBimestre() {
        return Bimestre;
    }

    public void setBimestre(String Bimestre) {
        this.Bimestre = Bimestre;
    }

    public String getNota1() {
        return Nota1;
    }

    public void setNota1(String Nota1) {
        this.Nota1 = Nota1;
    }

    public String getNota2() {
        return Nota2;
    }

    public void setNota2(String Nota2) {
        this.Nota2 = Nota2;
    }

    public String getNota3() {
        return Nota3;
    }

    public void setNota3(String Nota3) {
        this.Nota3 = Nota3;
    }

    @Override
    public String Codigo() {
      return "A"+getCodigo();
    }

   
   
    
}


