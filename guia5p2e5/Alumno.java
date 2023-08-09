package guia5p2e5;

public class Alumno implements Comparable<Alumno>{

    private String apellido;

    private String nombre;

    private Integer anio;

    public Alumno(String apellido, String nombre, Integer anio) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.anio = anio;
    }    

    public Alumno() {
    }



    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Alumno{" + "apellido=" + apellido + ", nombre=" + nombre + ", anio=" + anio + '}';
    }

    @Override
    public int compareTo(Alumno o) {
        return this.apellido.compareTo(o.getApellido());
    }
    
    
    
}
