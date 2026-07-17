public class Main {


    public static void main(String[] args) {


        Student student =
        new Student("Siddhi Sawarn", 101);



        Course oop =
        new Course(
            "Object Oriented Programming",
            4,
            "A"
        );


        Course dsa =
        new Course(
            "Data Structures",
            3,
            "B"
        );


        Course java =
        new Course(
            "Java Programming",
            3,
            "A"
        );



        student.addCourse(oop);

        student.addCourse(dsa);

        student.addCourse(java);



        StudentManager manager =
        new StudentManager(student);


        manager.start();


    }

}
