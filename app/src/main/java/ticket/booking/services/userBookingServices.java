package ticket.booking.services;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import ticket.booking.entities.User;

public class userBookingServices {
    private User user;
    private static final String user_path="../localDB/users.json";
    private ObjectMapper objectMapper=new ObjectMapper();
    private List<User> userList;
    
    public  userBookingServices(User user) throws IOException{
        this.user=user;
        File users=new File(user_path);
        userList=objectMapper.readValue(users,new TypeReference<List<User>>(){});
    }
}
