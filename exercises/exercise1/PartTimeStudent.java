// derived class of Student
public class PartTimeStudent extends Student {

    public PartTimeStudent (String sid, String sn){
        super(sid, sn);
        // recording the student's part-time status.
        IsFullTime = false;
    }

}
