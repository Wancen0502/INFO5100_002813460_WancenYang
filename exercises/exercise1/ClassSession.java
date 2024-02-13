import java.util.*;
public class ClassSession {
    ArrayList<Student> studentList;

    public ClassSession(){
        studentList = new ArrayList<Student>();
    }

    public Student addNewStudent(Student s){
        studentList.add(s);
        return s;
    }

    public ArrayList<Student> getStudentlist(){
        return studentList;
    }

    public int TotalStudentNumber(){
        int ans = studentList.size();
        return ans;
    }

    //This method is used to calculate average quiz scores per student.
   public void CalculateStudentQuizMean() {
        float ans = 0;
        float TotalScore = 0;
        for(Student s : studentList) {
            for (int i : s.getQuizeTranscript()) {
                TotalScore = i + TotalScore;
            }
            ans =  TotalScore /(s.getQuizeTranscript().length);
            System.out.println( s.getStudentID() + " " + s.getStudentName() + "s average quiz score is " + String.format("%.2f", ans).toString()  + ".");
            ans = 0;
            TotalScore = 0;
        }

        }

        // This method is used to sort quiz score in asending order and print.
    public void SortQuizScore() {
        for (int i =0; i<15; i++) {
            ArrayList<Integer> temp = new ArrayList<Integer>() ;
            for (Student s : studentList) {
                int[] ans = s.getQuizeTranscript();
                temp.add(ans[i]);
            }
            temp.sort(Comparator.naturalOrder());
            System.out.println("The ascending score rank of Quiz " + (i+1)+ " is " +temp);
        }
    }

    //This method is used to print out the list of part-time student.
    public void printPartTimeStudent(){
        System.out.println("Here is the list of part-time students:");
        for(Student s : studentList){
            // judge if the student is part-time student.
            if (s.getStudentStatus() == false){
                System.out.println(s.getStudentName());
            }
        }
    }

    //This method is used to print out full-time students' exam scores.
    public void printExamScore(){
        for( Student s : studentList){
            // judge if the student is full-time student.
            if (s.getStudentStatus() == true){
                int[] ans = s.getExamTranscript();
                int temp1 = 0;
                int temp2 = 0;
                for (int i =0; i<2; i++){
                    if (i==0){
                        temp1 = ans[0];
                    }
                     else{
                        temp2 = ans[1];
                    }
                }
                System.out.println(s.getStudentName()+"'s two exam scores are "+ temp1 +" and "+ temp2 + ".");
                }
            }
    }

// This below code is used for testing.
   // public void getSorce() {
        //for (Student s : studentList) {
            //System.out.println(s.getStudentName() + "'s quiz scores are " + Arrays.toString(s.getQuizeTranscript()));
            //}
        //}
    }










