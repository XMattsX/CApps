package guia5p2e5;

public class Guia5p2e5 {

    
    public static void main(String[] args) {
        Alumno uno= new Alumno("Mojica","Marina",5);
        Alumno tres= new Alumno("Sanchez","Milo",1);
        Alumno dos=new Alumno("Torres", "Romina",3);
        
        Colegio ulp=new Colegio("ULP");
        ulp.agregarAlumno(100, uno);
        ulp.agregarAlumno(104, dos);
        ulp.agregarAlumno(102, tres);
        
        System.out.println("Listado alfabeticamente");
        ulp.listarAlfabeticamente();
        
        System.out.println("Listado por caracter");
        ulp.listaPorCaracter("M");
    }
    
}
