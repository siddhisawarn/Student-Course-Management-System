public class Main {


    public static void main(String[] args) {



        Student student =
        new Student(
            "Siddhi Sawarn",
            101
        );



        for(Course course : FileManager.loadCourses()) {


            student.addCourse(course);


        }



        StudentManager manager =
        new StudentManager(student);



        manager.start();



    }

}
