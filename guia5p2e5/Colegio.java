package guia5p2e5;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class Colegio {

    private TreeMap <Integer, Alumno> alumnos;

    private String nombre;

    public Colegio(String nombre) {
        this.nombre = nombre;
        alumnos=new TreeMap();
        
    }

    public void agregarAlumno(Integer legajo, Alumno alumno) {
        alumnos.put(legajo, alumno);
    }

    public void quitarAlumno(Integer legajo) {
        alumnos.remove(legajo);
    }


    public void listarAlfabeticamente() {       
      for (int alumno : alumnos.keySet()) {
            System.out.println(alumno+" "+alumnos.get(alumno).getApellido());
        }
      
    }
    
    public void listaPorCaracter(String letra){
        for(Map.Entry<Integer, Alumno> entry: alumnos.entrySet()){
            if(entry.getValue().getApellido().startsWith(letra)){
                System.out.println(entry);
            }            
        }
    }

//    private static Comparator<Alumno> compararApellido = new Comparator<Alumno>() {
//        @Override
//        public int compare(Alumno o1, Alumno o2) {
//            return o1.getApellido().compareTo(o2.getApellido());
//        }
//    };
   
}

