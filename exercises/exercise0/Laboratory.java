public class Laboratory {
    int LabNumber;
    String Location;
    String labSubject;
    Department DepartmentAssigned;
    Faculty Administrator;
    boolean Accessibility;
    boolean Internet;
    boolean DigitalEquipment;
    String OpenTime;

    public Laboratory (int ln, String l, String ls,  Department da, Faculty ad, boolean a, boolean i, boolean de,String ot){
        LabNumber = ln;
        Location = l;
        labSubject= ls;
        DepartmentAssigned = da;
        Administrator = ad;
        Accessibility = a;
        Internet = i;
        DigitalEquipment =de;
        OpenTime = ot;
        System.out.println("Lab "+ ln +" has been created!" );
    }

    public int getLabNumber() {
        return LabNumber;
    }

    public String getLocation() {
        return Location;
    }

    public String getlabSubject() {
        return labSubject;
    }








}
