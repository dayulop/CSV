package modelo;

import com.opencsv.bean.CsvBindAndJoinByPosition;
import com.opencsv.bean.CsvBindByPosition;

public class DatoEquipo {
    @CsvBindByPosition(position = 0)
    private int Team1_id;
    @CsvBindByPosition(position = 1)
    private String Team1_name;
    @CsvBindByPosition(position = 2)
    private String Team1_description;
    @CsvBindByPosition(position = 3)
    private int Team1_Points;
    @CsvBindByPosition(position = 4)
    private int Team2_Points;
    @CsvBindByPosition(position = 5)
    private int Team2_id;
    @CsvBindByPosition(position = 6)
    private String Team2_name;
    @CsvBindByPosition(position = 7)
    private String Team2_description;

    public int getTeam1_id(){
        return Team1_id;
    }
    public void setTeam1_id(int id){
        this.Team1_id = id;
    }
    public int getTeam1_Points(){
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

    public int getTeam2_Points(){
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
    public int getTeam2_id(){
        return Team2_id;
    }
    public void setTeam2_id(int id){
        this.Team2_id = id;
    }
}
