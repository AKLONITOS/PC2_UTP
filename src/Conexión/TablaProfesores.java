
package Conexión;

import PaqueteDeTrabajo.Profesor_1;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author EQUIPO
 */
public class TablaProfesores {
    String url="Tabla_Profesor.txt";
    
    FileReader fr;
    BufferedReader br;
    
    FileWriter fw;
    
    Profesor_1 b;
    
    public ArrayList<Profesor_1> array=new ArrayList();
            
    public void insertar(Profesor_1 b)throws FileNotFoundException,IOException{
        fw=new FileWriter(url,true);
        String cad=b.getCurso()+"-"+b.getNombres()+"-"+b.getApellidos()+"-"+b.getDNI()+"-"+b.Codigo();
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
            b = new Profesor_1 (vec[0], vec[1], vec[2],Integer.parseInt(vec[3]),vec[4]);
            array.add(b);
            
            cad=br.readLine();
            
            
        }
       
    }
    public void eliminar(Profesor_1 prof) throws IOException {
    ArrayList<Profesor_1> lista = new ArrayList<>();
    leer();
    for (Profesor_1 profesor : array) {
        if (!profesor.getCurso().equals(prof.getCurso()) || !profesor.getNombres().equals(prof.getNombres())||
                !profesor.getApellidos().equals(prof.getApellidos())|| profesor.getDNI() != prof.getDNI()||
                        !profesor.getCodigo().equals(prof.getCodigo())) {
            lista.add(profesor);
            
        }
    }
    try (FileWriter fw = new FileWriter(url)) {
        for (Profesor_1 profesor : lista) {
            fw.write(profesor.getCurso()+ "-" + profesor.getNombres()+ "-" + profesor.getApellidos()+ "-" + profesor.getDNI()+ "-" + profesor.getCodigo());
            fw.write(System.lineSeparator());
        }
    }

    
    }
}
