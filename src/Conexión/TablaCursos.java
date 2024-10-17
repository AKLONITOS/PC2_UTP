/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexión;

import PaqueteDeTrabajo.Curso;
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
public class TablaCursos {
    String url="C:\\Users\\USUARIO\\Desktop\\basededatosprueva\\Tablacurso.txt";
    
    FileReader fr;
    BufferedReader br;
    
    FileWriter fw;
    
    Curso a;
    
    public ArrayList<Curso> array=new ArrayList();
            
    public void insertar(Curso a)throws FileNotFoundException,IOException{
        fw=new FileWriter(url,true);
        String cad=a.getNombreCurso()+"-"+a.getCodigoCurso();
        fw.write(cad);
        fw.write(10);
        fw.close();   
    }
    
    public void leer()throws FileNotFoundException,IOException{
        array.clear();//limpiar el array list
        fr=new FileReader(url);
        br=new BufferedReader(fr);//copiar la informacion a al memoria
        String cad=br.readLine();
        
        String vec[];
        
        while (cad!=null){
            vec=cad.split("-");
            a=new Curso (vec[0], vec[1]);
            array.add(a);
            
            cad=br.readLine();//Se vuelve a repetir todos los registros guardados
            
            
        }
       
    }




}
