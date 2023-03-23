package modelo;

import com.opencsv.bean.AbstractCsvConverter;
import com.opencsv.bean.CsvBindByPosition;
import com.opencsv.exceptions.CsvConstraintViolationException;
import com.opencsv.exceptions.CsvDataTypeMismatchException;

//TODO son la hubicacion con los respectivos datos que tiene el archivo "primer_partido"
public class DatoResultados {
    @CsvBindByPosition(position = 0)
    private Integer Team1_id;
    @CsvBindByPosition(position = 1)
    private String Team1_name;
    @CsvBindByPosition(position = 2)
    private String Team1_description;
    @CsvBindByPosition(position = 3)
    private Integer Team1_Points;
    @CsvBindByPosition(position = 4)
    private Integer Team2_Points;
    @CsvBindByPosition(position = 5)
    private Integer Team2_id;
    @CsvBindByPosition(position = 6)
    private String Team2_name;
    @CsvBindByPosition(position = 7)
    private String Team2_description;

    public DatoResultados(Integer id1, String name1, String description1, Integer points1, Integer points2, Integer id2, String name2, String description2){
        super();
        this.Team1_name = name1;
        this.Team1_description = description1;
        this.Team1_id = id1;
        this.Team1_Points = points1;
        this.Team2_name = name2;
        this.Team2_description = description2;
        this.Team2_id = id2;
        this.Team2_Points = points2;
    }


    public Integer getTeam1_id(){
        return Team1_id;
    }
    public void setTeam1_id(int id){
        this.Team1_id = id;
    }
    public Integer getTeam1_Points(){
        return Team1_Points;
    }
    public void setTeam1_Points(int points){
        this.Team1_Points = points;
    }
    public String getTeam1_name(){
        return Team1_name;
    }
    public void setTeam1_name(String name){
        this.Team1_name = name;
    }
    public String getTeam1_description(){
        return Team1_description;
    }
    public void setTeam1_description(String Description){
        this.Team1_description = Description;
    }

    public Integer getTeam2_Points(){
        return Team2_Points;
    }
    public void setTeam2_Points(int points){
        this.Team2_Points = points;
    }
    public String getTeam2_name(){
        return Team2_name;
    }
    public void setTeam2_name(String name){
        this.Team2_name = name;
    }
    public String getTeam2_description(){
        return Team2_description;
    }
    public void setTeam2_description(String Description){
        this.Team2_description = Description;
    }
    public Integer getTeam2_id(){
        return Team2_id;
    }
    public void setTeam2_id(int id){
        this.Team2_id = id;
    }


}
