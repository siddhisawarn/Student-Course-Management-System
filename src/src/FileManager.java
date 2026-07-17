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


}
