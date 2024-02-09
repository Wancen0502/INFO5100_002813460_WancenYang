public class ActivitySpace {
    String SpaceName;
    String Location;
    String Price;
    String OpenTime;
    String OpenSeason;
    boolean Aviable;
    boolean Accessibility;
    String IndoorOrOutdoor;

    public ActivitySpace (String sn, String l, String p, String ot, String os, boolean ab, boolean a, String ioo){
        SpaceName = sn;
        Location = l;
        Price= p;
        OpenTime = ot;
        OpenSeason = os;
        Aviable = ab;
        Accessibility = a;
        IndoorOrOutdoor = ioo;
        System.out.println(sn + " has been created!");

    }

    public String getAcitivityName() {
        return SpaceName;
    }
    public String getLocation() {
        return Location;
    }
    public String getOpenTime() {
        return OpenTime;
    }

}
