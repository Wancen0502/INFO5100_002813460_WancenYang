import java.util.ArrayList;

public class Department {
    String DepartmentName;
    String Introducation;
    int fund;
    int StudentSize;
    ArrayList<Faculty> facultylist;
    ArrayList<Major> Majorlist;
    ArrayList<Course> Courselist;
    String Collaborations;

    public Department(String dn, String intr, int f, int ss, String a){
        DepartmentName = dn;
        Introducation = intr;
        fund = f;
        StudentSize = ss;
        Collaborations = a;
        System.out.println("Department of "+ dn +" has been created!" );
    }

    public Faculty addNewFaculty(Faculty f){
        facultylist.add(f);
        return f;
    }

    public Major addNewMajor(Major m){
        Majorlist.add(m);
        return m;
    }
    public Course addNewCourse(Course c){
        Courselist.add(c);
        return c;
    }






}
