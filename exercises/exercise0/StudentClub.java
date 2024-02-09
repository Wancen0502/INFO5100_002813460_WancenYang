public class StudentClub {
    String ClubCode;
    String ClubName;
    String ClubType;
    int EstablishmentYear;
    String MissionStatement;
    Student Founder;
    int ClubFinances;
    String WebsiteHompage;

    public StudentClub(String cc, String cn, String ct, int ey, String ms, Student f, int cf){
        ClubCode = cc;
        ClubName = cn;
        ClubType = ct;
        EstablishmentYear = ey;
        MissionStatement = ms;
        Founder = f;
        ClubFinances = cf;
        System.out.println(cc + " " + cn + " is a " + ct +" student club." );
    }

    public String getClubCode() {
        return ClubCode;
    }

    public String getClubName() {
        return ClubCode;
    }

    public String getClubType() {
        return ClubType;
    }

}
