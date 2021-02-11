import java.util.Date;

public class Menu {
    void menu(){
        
    }
    public static void main(String[] args) {
        Reservation testReservation = new Reservation("George", "Knapasjo", new Date());
        Database testDB = new Database();
        testDB.Add(testReservation);
        for(int i = 0; i < testDB.getDatabase().size(); i++){
            System.out.println(testDB.getDatabase().get(i));
        }
    }
}
