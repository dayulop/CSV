package modelo;

public class Pronostico {
    private Integer id;
    private String nombre;
    private Partido partido;
    private Integer equipo;
    private String resultado;

    public Pronostico(Integer id, String nombre, Partido partido, Integer equipo, String resultado, Integer puntos) {
        this.id = id;
        this.nombre = nombre;
        this.equipo = equipo;
        this.partido = partido;
        this.resultado = resultado;
    }

    public int puntos() {
        int puntos = 0;
        ResultadoEnum resultadotrue = this.partido.resultado(this.equipo);
        if (resultadotrue.toString().equals(this.resultado.toUpperCase())) {
            puntos = 1;
        }

        System.out.println("estos son los puntos que gana mariana: " + puntos);
        return puntos;
    }

    public String getData() {
        Integer var10000 = this.id;
        String info = "Pronostico: " + var10000 + "\n" +
                "De: " + this.nombre + "\n" +
                "Equipo: " + this.equipo + "\n" +
                "Partido: " + String.valueOf(this.partido) + "\n" +
                "Resultado: " + this.resultado + "\n" +
                "Puntos_Obtenidos: " + this.puntos() + "\n" +
                "-------------------------------";
        System.out.println(info);
        return info;
    }
}
