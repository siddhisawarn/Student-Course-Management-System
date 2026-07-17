public class Course {

    private String courseName;
    private int credits;


    public Course(String courseName, int credits){

        this.courseName = courseName;
        this.credits = credits;

    }


    public String getCourseName(){

        return courseName;

    }


    public int getCredits(){

        return credits;

    }


    public void displayCourse(){

        System.out.println(
            courseName + " - Credits: " + credits
        );

    }

}
