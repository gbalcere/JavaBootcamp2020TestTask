package sef.ATestTask.FirstActivity;


//TODO Implement class Student with parent Person

public class Student extends Person{

    //Attributes
    String schoolName;

    //Behavior - default constructor
    public Student(){
        this.schoolName = "Unknown";
        System.out.println("I am study in university" + schoolName);
    }

    // getter for String school
    public String getSchoolName() {
        return schoolName;
    }

    // setter for String school
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}
