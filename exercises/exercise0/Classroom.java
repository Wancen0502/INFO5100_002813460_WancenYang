import java.util.ArrayList;

public class Classroom {
    int RoomNumber;
    int Capacity;
    String Location;
    String type;
    boolean Accessibility;
    boolean Internet;
    boolean DigitalEquipment;
    ArrayList<String> AvailabilitySchedule;

    public Classroom (int rn, int c, String l, String t, boolean a, boolean i, boolean de){
        RoomNumber = rn;
        Capacity = c;
        Location = l;
        type = t;
        Accessibility = a;
        Internet = i;
        DigitalEquipment =de;
        System.out.println("Room "+ rn + " has been created!");
    }

    public int getRoomNumber() {
        return RoomNumber;
    }

    public  int getRoomCapacity() {
        return Capacity;
    }

    public String getClubType() {
        return type;
    }


}
