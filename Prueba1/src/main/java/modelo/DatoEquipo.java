package modelo;

import com.opencsv.bean.CsvBindAndJoinByPosition;

public class DatoEquipo {
    @CsvBindAndJoinByPosition(position = 0)
    private int Team1_id;
    @CsvBindAndJoinByPosition(position = 1)
    private String Team1_name;
    @CsvBindAndJoinByPosition(position = 2)
    private String Team1_description;
    @CsvBindAndJoinByPosition(position = 3)
    private int Team1_Points;
    @CsvBindAndJoinByPosition(position = 4)
    private int Team2_Points;
    @CsvBindAndJoinByPosition(position = 5)
    private int Team2_id;
    @CsvBindAndJoinByPosition(position = 6)
    private String Team2_name;
    @CsvBindAndJoinByPosition(position = 7)
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
