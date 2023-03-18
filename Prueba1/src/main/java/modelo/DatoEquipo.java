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
    private int Team_Points;
    @CsvBindAndJoinByPosition(position = 5)
    private int Team2_id;
    @CsvBindAndJoinByPosition(position = 6)
    private String Team2_name;
    @CsvBindAndJoinByPosition(position = 7)
    private String Team2_description;

    

}
