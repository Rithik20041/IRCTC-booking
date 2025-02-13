package ticket.booking.entities;
import java.sql.Time;
import java.util.*;
public class Train {
    private String trainNo;
    private String trainId;
    private List<List<Integer>> seats;
    private Map<String,String> stationTimes;
    private List<String> stations;
    public Train(String trainNo, String trainId, List<List<Integer>> seats, Map<String,String> stationTimes, List<String> stations){
        this.trainNo = trainNo;
        this.trainId = trainId;
        this.seats = seats;
        this.stationTimes = stationTimes;
        this.stations=stations;
    } 
    public String gettrainNo(){
        return trainNo;
    }
    public String gettrainId(){
        return trainId;
    }
    public List<List<Integer>> getseats(){
        return seats;
    }
    public Map<String,String> getstationTimes(){
        return stationTimes;
    }
    public List<String> getstations(){
        return stations;
    }
    public void settrainNo(String trainNo){
        this.trainNo=trainNo;
    }
    public void settrainId(String trainId){
        this.trainId=trainId;
    }
    public void setseats(List<List<Integer>> seats){
        this.seats=seats;
    }
    public void setstationTimes(Map<String,String> stationTimes){
        this.stationTimes=stationTimes;
    }
    public void setstations(List<String> stations){
        this.stations=stations;
    }
    public String getTrainInfo(){
        return String.format("TrainId:%s TrainNo:%s",trainId,trainNo)
    }




}
