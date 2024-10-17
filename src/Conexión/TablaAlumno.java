
package Conexión;

import PaqueteDeTrabajo.Alumno;
import PaqueteDeTrabajo.Persona;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class TablaAlumno {
   
    String url="Tabla_Alumno.txt";
    
    FileReader fr;
    BufferedReader br;
    
    FileWriter fw;
    
    Persona e;
    
    public ArrayList<Persona> array=new ArrayList();
            
    public void insertar(Persona e)throws FileNotFoundException,IOException{
        fw=new FileWriter(url,true);
        String cad=e.getNombres()+"-"+e.getApellidos();
        fw.write(cad);
        fw.write(10);
        fw.close();
        
    }
    public void leer()throws FileNotFoundException,IOException{
        array.clear();
        fr=new FileReader(url);
        br=new BufferedReader(fr);
        String cad=br.readLine();
        
        String vec[];
        
        while (cad!=null){
            vec=cad.split("-");
            e=new Persona(vec[0], vec[1]);
            array.add(e);
            
            cad=br.readLine();
            
            
        }
       
    }
    public void eliminar(Persona e) throws IOException {
    ArrayList<Persona> lista = new ArrayList<>();
    leer();
    

    
    for (Persona persona : array) {
        if (!persona.getNombres().equals(e.getNombres()) || !persona.getApellidos().equals(e.getApellidos())) {
            lista.add(persona);
        }
    }

  
    try (FileWriter fw = new FileWriter(url)) {
        for (Persona persona : lista) {
            fw.write(persona.getNombres() + "-" + persona.getApellidos());
            fw.write(System.lineSeparator());
        }
    }
    
    }
}
