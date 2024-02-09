import java.util.ArrayList;

public class College {
    String CollegeName;
    int EstablishYear;
    String Founder;
    int StudentSize;
    int FacultySize;
    String Introduction;
    ArrayList<Department> departmentlist;
    String FamousAlumni;

    public College (String cn, int ey, String f, String i,String fa){
        CollegeName = cn;
        EstablishYear = ey;
        Founder = f;
        Introduction = i;
        FamousAlumni = fa;
        System.out.println(cn +" has been established in " + ey + ".");
    }

    public String getCollegeNumber() {
        return CollegeName;
    }

    public  int getEstablishYear() {
        return EstablishYear;
    }

    public String getFounder() {
        return Founder;
    }

    public Department addNewDeparment(Department dpt){
        departmentlist.add(dpt);
        return dpt;
    }

    }
