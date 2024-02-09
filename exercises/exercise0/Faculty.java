public class Faculty {
    int FacultyID;
    String Name;
    String Gender;
    String DateOfBirth;
    String PhoneNumber;
    Department departmentAssign;
    int Salary ;
    boolean active;

    public Faculty(int i, String n, String g, String dob, String pn, Department da, boolean a){
        FacultyID = i;
        Name = n;
        Gender = g;
        DateOfBirth = dob;
        PhoneNumber = pn;
        departmentAssign = da;
        active = a;
        System.out.println(n +"'s faculty ID is " + i +".");
    }

    public int getFacultyID() {
        return FacultyID;
    }

    public void setFacutlySalary(int Salary){
        this.Salary = Salary;
    }

    public void ChangeFacutlyStatus(boolean active){
        this.active = active;
    }
}
