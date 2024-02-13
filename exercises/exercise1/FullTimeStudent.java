import java.util.*;
public class FullTimeStudent extends Student {
    public FullTimeStudent (String sid, String sn){
        super(sid, sn);
        // recording the student's full-time status.
        IsFullTime = true;
        // generate two extra field to hold two exam scores.
        ftsExam = new int[2];
    }

// This method is used to create two dummy exam score for each full-time students.
    public int[] generatedExamScore() {
        int[] ans = this.ftsExam;
        Random random = new Random();
        for (int i = 0; i <= 1; i++) {
            int temp = random.nextInt(31);
            ans[i] = temp;
        }
        return this.ftsExam;
    }


}


