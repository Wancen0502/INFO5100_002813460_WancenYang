import java.util.*;
// derived class of Student
public class Student {
    String StudentID;
    String StudentName;
    boolean IsFullTime;
    int[] ftsQuize;
    int[] ftsExam;

    public Student(){}
    public Student (String sid, String sn){
        StudentID = sid;
        StudentName = sn;
        // hold 15 quizzes scores for each student
        ftsQuize = new int[15];
    }

    public int[] getQuizeTranscript(){
        return ftsQuize;
    }

    public String getStudentID(){
        return StudentID;
    }

    public String getStudentName(){
        return StudentName;
    }

    public boolean getStudentStatus(){
        return IsFullTime;
    }


    // This method is used to create 15 dummy exam score for each student ( both of full-time and part-time student).
    public int[] generatedQuizScore() {
        int[] ans = this.ftsQuize;
        Random random = new Random();
        for (int i = 0; i <= 14; i++) {
            int temp = random.nextInt(11);
            ans[i] = temp;
        }
        return this.ftsQuize;

    }

    public int[] getExamTranscript(){
        return ftsExam;
    }


}








