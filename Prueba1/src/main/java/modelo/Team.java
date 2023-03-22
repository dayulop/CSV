package modelo;

public class Team {
    private String name;
    private Integer id;
    private Integer points;
    private String description;

    public Team(String name, String description, Integer id, Integer points){
        super();
        this.name = name;
        this.description = description;
        this.id = id;
        this.points = points;
    }
    public Team(){

    }


}
