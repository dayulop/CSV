package modelo;
public class Partido {
    public Partido(Integer id, Equipo equipo1, Equipo equipo2, Integer goles_equipo1, Integer goles_equipo2){
        this.id = id;
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.goles_equipo1 = goles_equipo1;
        this.goles_equipo2 = goles_equipo2;
    }
    private Integer id;
    private Equipo equipo1;
    private Equipo equipo2;
    private Integer goles_equipo1;
    private Integer goles_equipo2;

    public ResultadoEnum resultado(Integer equipo){
        ResultadoEnum resultadoTrue = null;
        if(equipo == equipo1.id()) {
            if (goles_equipo1 > goles_equipo2) {
                resultadoTrue = ResultadoEnum.GANADOR;
            } else if (goles_equipo1 == goles_equipo2) {
                resultadoTrue = ResultadoEnum.EMPATE;
            } else {
                resultadoTrue = ResultadoEnum.PERDEDOR;
            }
        }

        if(equipo == equipo2.id()) {
            if (goles_equipo2 > goles_equipo1) {
                resultadoTrue = ResultadoEnum.GANADOR;
            } else if (goles_equipo2 == goles_equipo1) {
                resultadoTrue = ResultadoEnum.EMPATE;
            } else {
                resultadoTrue = ResultadoEnum.PERDEDOR;
            }
        }
        return resultadoTrue;
    }

    public Integer id(){
        return this.id;
    }
    public Integer getGoles_equipo1(){
        return this.goles_equipo1;
    }
    public Integer getGoles_equipo2(){
        return this.goles_equipo2;
    }

    public String getNombreEquipo(Integer nro){
        String nombre = "";
        if (nro == 1){
            nombre = equipo1.getNombre();
        } else if (nro == 2){
            nombre = equipo2.getNombre();
        }

        return nombre;
    }
    public Integer getEquipoId(Integer nro){
        int id = 0;
        if (nro == 1){
            id = equipo1.id();
        } else if (nro == 2){
            id = equipo2.id();
        }

        return id;
    }
}
