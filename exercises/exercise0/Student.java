import java.util.ArrayList;

public class Student {
    int StudentID;
    String Name;
    String Gender;
    String DateOfBirth;
    ContactInformation contactInfo;
    Major MajorAssign;
    float GPA;
    boolean active;

        public Student(int i, String n, String g, String dob, Major ma, boolean a){
            StudentID = i;
            Name = n;
            Gender = g;
            DateOfBirth = dob;
            MajorAssign = ma;
            active = a;
            System.out.println(n +"'s student ID is " + i +".");
        }

    public int getStudentID() {
        return StudentID;
    }

    public void setStudentMajor(Major majorAssign){

            this.MajorAssign = majorAssign;
    }

    public String getStudentName() {
        return Name;
    }

    public void ChangeStudenStatus(boolean active){

            this.active = active;
    }


    public class ContactInformation{
        String addressline1;
        String addressline2;
        String city;
        String zip;
        String state;
        String phoneNumber1;
        String phoneNumber2;
        String Email;

    // ContactInformation is one of nest class of student class.
        public ContactInformation(String a1, String c, String z, String s, String pn1, String pn2, String e){
            addressline1 = a1;
            city = c;
            zip = z;
            state = s;
            phoneNumber1 = pn1;
            phoneNumber2 = pn2;
            Email = e;
            System.out.println("ContactInformation is one of nest class of student class. ");
        }

        public String getEmail() {
            return Email;
        }
        public String getPhoneNumber1() {
            return phoneNumber1;
        }
        public String getPhoneNumber2() {
            return phoneNumber2;
        }


    }
    // Transcript is one of nest class of student class.
    public class Transcript{
        int StudentID;
        String Name;
        String Semester;
        ArrayList<Course> Courselist;
        int Grade;
        float GPA;
        int EarnedCredit;
        boolean registered;

        public Transcript(Student s){
            System.out.println(s.getStudentName()+ " has a transcript now. (transcript is one of nest class of student class.)");
        }

        public void setStudentID(Student s) {
            this.StudentID = s.getStudentID();
        }

        public void setStudentName(Student s) {
            this.Name = s.getStudentName();
        }

        public String getSemester() {
           return Semester;
        }

    }

}


