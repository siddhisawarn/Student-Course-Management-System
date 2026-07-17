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

            System.out.println("3. Calculate GPA");

            System.out.println("4. Exit");


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

                    System.out.println(
                    "GPA: " + student.calculateGPA()
                    );

                    break;



                case 4:

                    System.out.println("Goodbye!");

                    break;



                default:

                    System.out.println("Invalid choice");

            }


        }while(choice != 4);


    }

}
