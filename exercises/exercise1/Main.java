import java.util.*;

public class Main {

    public static void main(String[] args) {

        ClassSession cs = new ClassSession();

        //create 15 full-time students.
        FullTimeStudent fts1 = new FullTimeStudent("F01","Tom");
        FullTimeStudent fts2 = new FullTimeStudent("F02","Emily");
        FullTimeStudent fts3 = new FullTimeStudent("F03","Sophia");
        FullTimeStudent fts4 = new FullTimeStudent("F04","Alexander");
        FullTimeStudent fts5 = new FullTimeStudent("F05","Olivia");
        FullTimeStudent fts6 = new FullTimeStudent("F06","William");
        FullTimeStudent fts7 = new FullTimeStudent("F07","Ave");
        FullTimeStudent fts8 = new FullTimeStudent("F08","Jacob");
        FullTimeStudent fts9 = new FullTimeStudent("F09","Mia");
        FullTimeStudent fts10 = new FullTimeStudent("F10","Ethan");
        FullTimeStudent fts11 = new FullTimeStudent("F11","Isabella");
        FullTimeStudent fts12 = new FullTimeStudent("F12","Michael");
        FullTimeStudent fts13 = new FullTimeStudent("F13","Charlotte");
        FullTimeStudent fts14 = new FullTimeStudent("F14","James");
        FullTimeStudent fts15 = new FullTimeStudent("F15","Amelia");

        // create 5 part-time Students.
        PartTimeStudent pts1 = new PartTimeStudent("P01","Daniel");
        PartTimeStudent pts2 = new PartTimeStudent("P02","Harper");
        PartTimeStudent pts3 = new PartTimeStudent("P03","Matthew");
        PartTimeStudent pts4 = new PartTimeStudent("P04","Evelyn");
        PartTimeStudent pts5 = new PartTimeStudent("P05","Lucas");

        // add these 20 students to the sample class session.
        cs.addNewStudent(fts1);
        cs.addNewStudent(fts2);
        cs.addNewStudent(fts3);
        cs.addNewStudent(fts4);
        cs.addNewStudent(fts5);
        cs.addNewStudent(fts6);
        cs.addNewStudent(fts7);
        cs.addNewStudent(fts8);
        cs.addNewStudent(fts9);
        cs.addNewStudent(fts10);
        cs.addNewStudent(fts11);
        cs.addNewStudent(fts12);
        cs.addNewStudent(fts13);
        cs.addNewStudent(fts14);
        cs.addNewStudent(fts15);

        cs.addNewStudent(pts1);
        cs.addNewStudent(pts2);
        cs.addNewStudent(pts3);
        cs.addNewStudent(pts4);
        cs.addNewStudent(pts5);

    // create dummy quiz score for each student randomly (full-time and part-time students).
        fts1.generatedQuizScore();
        fts2.generatedQuizScore();
        fts3.generatedQuizScore();
        fts4.generatedQuizScore();
        fts5.generatedQuizScore();
        fts6.generatedQuizScore();
        fts7.generatedQuizScore();
        fts8.generatedQuizScore();
        fts9.generatedQuizScore();
        fts10.generatedQuizScore();
        fts11.generatedQuizScore();
        fts12.generatedQuizScore();
        fts13.generatedQuizScore();
        fts14.generatedQuizScore();
        fts15.generatedQuizScore();

        pts1.generatedQuizScore();
        pts2.generatedQuizScore();
        pts3.generatedQuizScore();
        pts4.generatedQuizScore();
        pts5.generatedQuizScore();


    // create dummy exam score for each full-time student randomly .
        fts1.generatedExamScore();
        fts2.generatedExamScore();
        fts3.generatedExamScore();
        fts4.generatedExamScore();
        fts5.generatedExamScore();
        fts6.generatedExamScore();
        fts7.generatedExamScore();
        fts8.generatedExamScore();
        fts9.generatedExamScore();
        fts10.generatedExamScore();
        fts11.generatedExamScore();
        fts12.generatedExamScore();
        fts13.generatedExamScore();
        fts14.generatedExamScore();
        fts15.generatedExamScore();

    // 20 students in the Session.
        System.out.println(" ");
        System.out.println("There are total " + cs.TotalStudentNumber() + " students in the class session.");

    // print average quiz scores per student for the whole class (total score of each quiz is 10.)
        System.out.println(" ");
        cs.CalculateStudentQuizMean();

        // This below code is used to test whether SortQuizScore() is running correctly.
        //System.out.println(" ");
        //cs.getSorce();

    // print the list of quiz scores in ascending order for the session.
        System.out.println(" ");
        cs.SortQuizScore();

    // print names of part-time students.
        System.out.println(" ");
        cs.printPartTimeStudent();

    // print exam scores of full-time students (total score of each quiz is 30.).
        System.out.println(" ");
        cs.printExamScore();

    }

    }
