import java.util.ArrayList;


public class Student extends Person {


    private ArrayList<Course> courses;



    public Student(String name, int id) {

        super(name, id);

        courses = new ArrayList<>();

    }



    public void addCourse(Course course) {

        courses.add(course);

    }



    public void displayCourses() {

        System.out.println("\nCourses:");

        for (Course course : courses) {

            course.displayCourse();

        }

    }



    public double calculateGPA() {

        double totalPoints = 0;

        int totalCredits = 0;



        for (Course course : courses) {


            totalPoints += 
            course.getGradePoint() * course.getCredits();


            totalCredits += course.getCredits();

        }



        if (totalCredits == 0) {

            return 0;

        }



        return totalPoints / totalCredits;

    }



    public ArrayList<Course> getCourses() {

        return courses;

    }


}
