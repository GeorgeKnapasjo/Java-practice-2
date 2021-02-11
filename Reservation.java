import java.util.Date;

// import java.sql.Date;

public class Reservation {
    public String firstName;
    public String lastName;
    public Date reservationDate;


    Reservation(String fName, String lName, Date reservation){
        firstName = fName;
        lastName = lName;
        reservationDate = reservation;
    }
    Reservation(){
        
    }

    @Override
    public String toString() {
        return "Reservation [firstName=" + firstName + ", lastName=" + lastName + ", reservationDate=" + reservationDate
                + "]";
    }
}
