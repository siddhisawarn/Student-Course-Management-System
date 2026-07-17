import java.util.ArrayList;


public class Student extends Person {


    private ArrayList<Course> courses;


    public Student(String name, int id){

        super(name,id);

        courses = new ArrayList<>();

    }


    public void addCourse(Course course){

        courses.add(course);

    }


}
