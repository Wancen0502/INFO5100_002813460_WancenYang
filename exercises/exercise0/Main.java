//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println(" ");
        //create object 1.
        Major m1 = new Major("INFO", "Information Systems", "Master", 40,
                "Information Systems is a multidisciplinary field that explores the design, implementation, and management of technological solutions to facilitate the storage, retrieval, and dissemination of data for organizational decision-making and problem-solving.","User experience", true, true);
        Major m2 = new Major("COM", "Communications", "Bachelor", 120,
                "Communication Studies is an interdisciplinary field that examines the processes, theories, and effects of human communication across various contexts, including interpersonal, organizational, mass media, and digital platforms.","New Media", false, true);
        Major m3 = new Major("FIN", "Finance", "Master", 38,
                "Finance is a dynamic discipline that delves into the management of money, investments, and financial assets, analyzing markets, risk, and valuation to optimize decision-making and maximize returns in both corporate and personal financial contexts.","assets management", true, true);

        System.out.println(" ");
        //create object 2.     
        Department d1 = new Department("Interdisciplinary Engineering", "Interdisciplinary Engineering integrates principles and methodologies from multiple engineering disciplines to address complex problems and develop innovative solutions that transcend traditional disciplinary boundaries.", 20000000, 1, "The Innovation Nexus Institute");
        Department d2 = new Department("Innovative Communications", "At the Center for Innovative Communication, we foster creativity and cutting-edge research in exploring the evolving dynamics of human interaction across diverse media platforms.", 5000000, 1, "The Innovation Nexus Institute");
        Department d3 = new Department("Global Business", "At the Global Business Institute, we cultivate cross-cultural competencies and strategic insights to navigate the complexities of international markets and foster sustainable economic growth on a global scale.", 4000000, 1, "The Innovation Nexus Institute");

        System.out.println(" ");
        //create object 3.  
        Classroom cl1 = new Classroom(302, 40, "BuildingA", "Lecture Room", true, true, true);
        Classroom cl2 = new Classroom(408, 20, "BuildingB", "Lecture Room", true, true, true);
        Classroom cl3 = new Classroom(506, 10, "BuildingC", "Lecture Room", true, true, true);

        System.out.println(" ");
        //create object 4. 
        Student s1 = new Student(2813470, "Anna", "Female", "02-05-1999", m1, true);
        Student s2 = new Student(2813458, "Tom", "Male", "03-08-2002", m1, true);
        Student s3 = new Student(2813430, "Sam", "Male", "11-15-2001", m1, true);

        System.out.println(" ");
        //create the first nested class of class Student. 
        Student.ContactInformation ci1 = s1.new ContactInformation("123 Maple Street","Springfield","62701","IL","+1 (555) 123-4567","+44 20 1234 5678", "example1@example.com");
        Student.ContactInformation ci2 = s2.new ContactInformation("456 Oak Avenue","Manchester","03101","NH","+81 3 1234 5678","+61 2 1234 5678", "testuser1234@gmail.com");
        Student.ContactInformation ci3 = s3.new ContactInformation("789 Pine Road","Portland","62701"," OR","+49 30 12345678","+86 10 1234 5678", "john.doe@emailprovider.com");

        System.out.println(" ");
        //create the second nested class of class Student. 
        Student.Transcript st1 = s1.new Transcript(s1);
        Student.Transcript st2 = s1.new Transcript(s2);
        Student.Transcript st3 = s1.new Transcript(s3);

        System.out.println(" ");
        //create object 5.  
        Faculty f1 = new Faculty(315475, "Mary", "Female", "05-09-1967", "(555) 123-4567", d1, true);
        Faculty f2 = new Faculty(315411, "Emma", "Female", "09-23-1976", "(555) 987-6543", d3, true);
        Faculty f3 = new Faculty(315698, "Lee", "Male", "10-11-1970", "(555) 876-5432", d2, true);

        System.out.println(" ");
        //create object 6. 
        Course c1 = new Course("INFO5002","Introduction to Python", "Introduction to Python introduces learners to the fundamentals of programming using Python, covering basic syntax, data types, control structures, and introductory concepts in algorithmic problem-solving, providing a solid foundation for further exploration in software development" ,4, f1, 30, cl1 );
        Course c2 = new Course("FIN3001","Introduction to Venture Capital", "Introduction to Venture Capital provides a comprehensive overview of the principles and practices of venture capital investing, covering topics such as investment strategies, deal sourcing, due diligence, valuation, and portfolio management, essential for aspiring investors and entrepreneurs navigating the dynamic startup ecosystem." ,2, f2, 20, cl2);
        Course c3 = new Course("COM6187","New media,Business and Crisis Mangement","The course 'New Media, Business, and Crisis Management' explores the intersection of modern digital platforms, business strategies, and crisis management techniques, equipping students with the skills to navigate and effectively respond to challenges in today's rapidly evolving media landscape",4,c2, f3,15,cl3);

        System.out.println(" ");
        //create object 7.  
        StudentClub sc1 = new StudentClub("S255", "LovingBasketball", "Sport", 2019,"Our mission is to unite students through basketball, promoting teamwork, skill development, and a love for the game.", s1, 5000 );
        StudentClub sc2 = new StudentClub("A118", "DrawingDrawing", "Arts", 2020, "Our mission is to inspire creativity, foster artistic growth, and build a supportive community for student artists passionate about exploring and expressing themselves through visual art.", s2, 3000 );
        StudentClub sc3 = new StudentClub("S106", "LovingHiking", "Sport", 2021, "Our mission is to ignite a passion for dance, foster artistic expression, and cultivate a supportive community for students to explore, learn, and grow as dancers.", s3, 5000 );

        System.out.println(" ");
        //create object 8.  
        College clg1 = new College("School of Engineering",1880,"Emily Johnson","The School of Engineering is dedicated to fostering innovation, excellence, and interdisciplinary collaboration, equipping students with the knowledge, skills, and hands-on experience necessary to tackle real-world engineering challenges and make meaningful contributions to society.","Emily Thompson");
        College clg2 = new College("School of Communication",1786,"Liam Parker","The School of Communication is committed to exploring the dynamic landscape of communication, media, and technology, preparing students to critically analyze, create, and navigate diverse media forms while fostering a deep understanding of their societal impact.","Benjamin Lee");
        College clg3 = new College("School of Business",1988,"Sophia Anderson","The Business School is dedicated to cultivating future leaders equipped with the knowledge, skills, and ethical principles necessary to excel in the global marketplace, fostering innovation, entrepreneurship, and responsible business practices.","Samantha Rodriguez");

        System.out.println(" ");
        //create object 9.  
        Laboratory lb1 = new Laboratory(111, "BulidingL", "ComptureLab", d1, f1, false, true, true,"Monday to Friday");
        Laboratory lb2 = new Laboratory(212, "BulidingL", "BusinessLab", d1, f2, true, true, true,"Monday to Friday");
        Laboratory lb3 = new Laboratory(314, "BulidingL", "MediaLab", d1, f3, true, true, true,"Monday to Friday");

        System.out.println(" ");
        //create object 10.  
        ActivitySpace as1 = new ActivitySpace("Swimming Pool","Outside gym", "Free to all students and faculty", "all day", "Summer",true, true,"Outdoor" );
        ActivitySpace as2 = new ActivitySpace("Library","Building D", "Free to all students and faculty", "8:00am-18pm, from Monday to Friday", "all year",true, true,"Indoor" );
        ActivitySpace as3 = new ActivitySpace("Playground","At center of the University", "Free to all students and faculty", "all day", "all year",true, true,"Outdoor" );
    }
}