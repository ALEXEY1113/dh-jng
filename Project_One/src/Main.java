import model.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by ALEXEY on 5/9/2017.
 */
public class Main {

//    private static final String EMAIL_SUSANA_LIMA = "susana.lima@dharbor.com";

    public static void main(String[] arg){

        System.out.println("=========== STUDENT ============");
        Student student = new Student("9876", "Yoss model.Student", "568946", "December - 21 - 1873", 87.6);
        //student.showInfo();
        /*System.out.println(student.toString());*/

        System.out.println("=========== TEACHER ============");
        Teacher teacher = new Teacher("6548", "Eddy model.Teacher", "568946", "June - 21 - 1856", "History", 2700, 5);
        teacher.showInfo();

        System.out.println("=========== TEACHER Speciality ============");
        Teacher.Speciality speciality = new Teacher.Speciality();
        speciality.setmName("Geography");
        speciality.showInfoSpeciality();

        System.out.println("=========== STUDENT TEACHER ============");
        StudentTeacher bob = new StudentTeacher("56254", "Bob Marley", "985654", "August - 5 - 1990", "Web Programming", 2700, 2, "UMSS FCYT");
        //bob.showInfo();

        System.out.println("=========== PRINCIPAL ============");
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2000);
        calendar.set(Calendar.MONTH, Calendar.MARCH);
        calendar.set(Calendar.DATE, 23);
        Principal principal = new Principal("56895", "Bellatryx", "565854", "May - 14 - 1985", calendar.getTime());
        //principal.showInfo();

        /*  TEST INSTANCE OF  */
//        doSomething(principal);
//        doSomething(student);
//        doSomething(teacher);

        ArrayList<Assignment> assignments = new ArrayList<>();
        assignments.add(new Assignment("Biology Homework", "Biology", new Date()));
        assignments.add(new Assignment("Java Homework", "Java", new Date(System.currentTimeMillis() - (24*60*60*1000))));
        assignments.add(new Assignment("English Homework", "English", new Date(System.currentTimeMillis() + (24*60*60*2000))));

        /****************  STATIC USES  *****************/
        //model.Assignment farthestAssignment = new model.Assignment();
        //System.out.println(model.Assignment.getFarthestInPastAssignment(assignments).getmClassName());
        //System.out.println("Default Score: " + model.Assignment.ASSIGNMENT_DEFAULT_SCORE);

        student.addListAssignment(assignments);
        student.setCurrentAssignment(assignments.get(assignments.size() - 1));
        student.showInfo();
        student.addAssignment(new Assignment("Python Homework", "Python", new Date()));
        student.setCurrentAssignment(assignments.get(assignments.size() - 1));
        student.showInfo();
        // Using Varargs
        student.addAssignments(
                new Assignment("Discovery Channel", "TV Program", new Date()),
                new Assignment("Geography Channel", "TV Program", new Date(System.currentTimeMillis() - (24*60*60*1000))),
                new Assignment("History Channel", "TV Program", new Date(System.currentTimeMillis() - (24*60*60*3000))),
                new Assignment("Nickelodeon Channel", "TV Program", new Date(System.currentTimeMillis() - (24*60*60*5000)))
        );

        int lastAssignment = student.getmAssignments().size();
        student.setCurrentAssignment(student.getmAssignments().get(lastAssignment - 1));
        student.showInfo();
    }

    /*
    public static void doSomething(model.Person person) {
        if (person instanceof model.Student) {
            System.out.println("I am a model.Student!!! " + person.getmName());
        } else if (person instanceof model.Teacher) {
            System.out.println("I am a model.Teacher!!! " + person.getmName());
        } else if (person instanceof model.Principal) {
            System.out.println("I am a model.Principal!!! " + person.getmName());
        }
    }*/
}
