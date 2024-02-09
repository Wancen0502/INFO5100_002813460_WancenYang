public class Course {
    String CourseCode;
    String CourseName;
    String Description;
    int Credit;
    Course Prequiresites;
    Faculty Instructor;
    int SeatSize;
    Classroom classRoom;

    public Course (String cc, String cn, String dp, int c, Course pq,Faculty f, int ss, Classroom cr ) {
        CourseCode = cc;
        CourseName = cn;
        Description = dp;
        Credit = c;
        Prequiresites = pq;
        Instructor = f;
        SeatSize = ss;
        classRoom = cr;
        System.out.println(cc+" "+ cn +" has been created!" );
    }
    public Course (String cc, String cn, String dp, int c,Faculty f, int ss, Classroom cr ) {
        CourseCode = cc;
        CourseName = cn;
        Description = dp;
        Credit = c;
        Instructor = f;
        SeatSize = ss;
        classRoom = cr;
        System.out.println(cc+" "+ cn +" has been created!" );
    }

    public String getCourseCode() {
        return CourseCode;
    }

    public String getCourseName() {
        return CourseName;
    }

    public String getDescription() {
        return Description;
    }
}

