package modelo.no_utilizado;

public class Equipo {
    public Integer id;
    private String nombre;
    private String descripcion;

    public Equipo(Integer id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getData() {
        String equipoInfo = "Equipo: " + this.id + "\nNombre: " + this.nombre + "\nDescripcion: " + this.descripcion + "\n-------------------------------";
        System.out.println(equipoInfo);
        return equipoInfo;
    }

    public String id() {
        String NroEquipo = "" + this.id;
        System.out.println(NroEquipo);
        return NroEquipo;
    }
}
