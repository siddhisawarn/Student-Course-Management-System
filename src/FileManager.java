import java.io.*;
import java.util.ArrayList;


public class FileManager {



    public static void saveCourses(ArrayList<Course> courses){


        try{


            FileWriter writer =
            new FileWriter("courses.txt");



            for(Course course : courses){


                writer.write(
                    course.getCourseName()
                    + ","
                    + course.getCredits()
                    + ","
                    + course.getGrade()
                    + "\n"
                );


            }



            writer.close();



        }catch(IOException e){


            System.out.println(
                "Error saving file"
            );


        }


    }




    public static ArrayList<Course> loadCourses(){


        ArrayList<Course> courses =
        new ArrayList<>();



        try{


            File file =
            new File("courses.txt");



            Scanner scanner =
            new Scanner(file);



            while(scanner.hasNextLine()){


                String line =
                scanner.nextLine();



                String[] data =
                line.split(",");



                Course course =
                new Course(
                    data[0],
                    Integer.parseInt(data[1]),
                    data[2]
                );



                courses.add(course);


            }



            scanner.close();



        }catch(Exception e){


            System.out.println(
                "No saved courses found"
            );


        }



        return courses;


    }


}
