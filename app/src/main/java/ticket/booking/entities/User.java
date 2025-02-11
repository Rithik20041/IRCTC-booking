package ticket.booking.entities;
import java.util.*;

public class User {
    private String name;
    private String password;
    private String hashedPassword;
    private String userId;
    private List<Ticket> ticketsbooked;
}
