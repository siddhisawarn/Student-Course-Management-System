import java.util.Scanner;


public class StudentManager {


    private Student student;
    private Scanner scanner;



    public StudentManager(Student student){

        this.student = student;
        scanner = new Scanner(System.in);

    }



    public void start(){


        int choice;



        do{


            System.out.println("\nStudent Course Management System");

            System.out.println("1. View Student Information");

            System.out.println("2. View Courses");

            System.out.println("3. Add Course");

            System.out.println("4. Calculate GPA");

            System.out.println("5. Exit");



            System.out.print("Choose an option: ");

            choice = scanner.nextInt();



            switch(choice){



                case 1:


                    student.displayInfo();


                    break;




                case 2:


                    student.displayCourses();


                    break;




                case 3:


                    scanner.nextLine();


                    System.out.print("Enter course name: ");

                    String name = scanner.nextLine();



                    System.out.print("Enter credits: ");

                    int credits = scanner.nextInt();



                    scanner.nextLine();



                    System.out.print("Enter grade: ");

                    String grade = scanner.nextLine();



                    Course newCourse =

                    new Course(
                        name,
                        credits,
                        grade
                    );



                    student.addCourse(newCourse);



                    System.out.println(
                        "Course added successfully!"
                    );



                    break;





                case 4:


                    System.out.println(
                        "GPA: "
                        + student.calculateGPA()
                    );


                    break;





                case 5:


                    System.out.println(
                        "Goodbye!"
                    );


                    break;





                default:


                    System.out.println(
                        "Invalid option"
                    );

            }



        }while(choice != 5);



    }


}
