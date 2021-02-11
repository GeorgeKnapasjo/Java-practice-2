import java.util.ArrayList;
import java.util.Date;

public class Database{
    ArrayList<Reservation> database;

    Database(){
        database = new ArrayList<>();
    }

    public void Add(Reservation reservation){
        database.add(reservation);
    }

    public void CancelReservation(Reservation reservation){
        for(int i = 0; i < database.size(); i++){
            if(database.get(i).equals(reservation)){
                database.remove(database.get(i));
            }
        }
    }

    public ArrayList<Reservation> getDatabase() {
        return database;
    }

    public void setDatabase(ArrayList<Reservation> database) {
        this.database = database;
    }

    // public Reservation getReservation(Reservation reservation){
    //     Reservation test;
    //     for(int i = 0; i < database.size(); i++){
    //         if(database.get(i).equals(reservation)){
    //             test = database.get(i);
    //         } 
    //         else{
    //             test = new Reservation();
    //         }
    //         }
    //         return test;
    //     }
    }
    
