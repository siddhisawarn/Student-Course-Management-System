public class Main {

    public static void main(String[] args) {


        Student student =
        new Student("Siddhi Sawarn", 101);


        Course javaCourse =
        new Course(
            "Object Oriented Programming",
            4
        );


        Course dataCourse =
        new Course(
            "Data Structures",
            3
        );


        student.addCourse(javaCourse);

        student.addCourse(dataCourse);


        System.out.println("Student Information");

        System.out.println(
            "Name: " + student.getName()
        );


        System.out.println(
            "ID: " + student.getId()
        );


        System.out.println();


        student.displayCourses();

    }
}
