package modelo;

public class Equipo {
    public Equipo(Integer id, String nombre, String descripcion){
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    public Integer id;
    private String nombre;
    private String descripcion;

    public String getNombre(){
        return nombre;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public Integer id(){
        return id;
    }

}
