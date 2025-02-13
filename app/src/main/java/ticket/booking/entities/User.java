package ticket.booking.entities;
import java.util.*;
import org.checkerframework.common.reflection.qual.GetMethod;

public class User {
    private String name;
    private String password;
    private String hashedPassword;
    private String userId;
    private List<Ticket> ticketsbooked;

    public User(String name,String password, String hashedPassword,String UserId,List<Ticket> ticketsbooked){
        this.name=name;
        this.password=password;
        this.hashedPassword=hashedPassword;
        this.userId=UserId;
        this.ticketsbooked=ticketsbooked;
    }
    public User(){}
    public String getname(){
        return name;
    }
    public String getpassword(){
        return password;
    }
    public String gethashedPassword(){
            return hashedPassword;
    }
    public String getuserId(){
                return userId;
    }
    public List<Ticket> getticketsbooked(){
        return ticketsbooked;
    }
    public void printTickets(){
        for(int i=0;i<ticketsbooked.size();i++){
            System.out.println(ticketsbooked.get(i).getTicketInfo());
        }
    }
    public void setname(String name){
        this.name=name;
    }
    public void setpassword(String password){
        this.password=password;
    }
    public void sethashedPassword(String hashedPassword){
        this.hashedPassword=hashedPassword;
    }
    public void setuserId(String userId){
        this.userId=userId;
    }
    public void setticketsbooked(List<Ticket> ticketsbooked){
        this.ticketsbooked=ticketsbooked;
    }
}
