package sef.ATestTask.FirstActivity;

public class Employee extends Person {
    //Attributes
        int empId;
        String jobTitle;
        String companyName;
        double salary;

    //TODO 1 create different constructors
    //default constructors
        public int Employee(int i, String s, String d, double v) {
            this.empId = 0;
            this.jobTitle = "unknown";
            this.companyName = "Unknown";
            this.salary = 00.00;
        System.out.println("I'm Employee_I constructor"); // Called when creating a Employee instance

        //Behavior - parameterized constructor
	    public Employee(int empId, String jobTitle, String companyName, double salary){
            this.empId = empId;
            this.jobTitle = jobTitle;
            this.companyName = companyName;
            this.salary = salary;
            System.out.println("My name is" + " " + firstName + " " + "and i am" + " " + age + " " + "years old" + "\nI am work as" + " " + jobTitle + " " + "in" + companyName);


            //TODO 2 add getters and setters
            //get for int empId
            public int getEmpId() {
                return empId;
            }

            //set int empId
            public void setEmpID ( int empId){
                this.empId = empId;
            }

            // getter for String jobTitle
            public String jobTitle () {
                return jobTitle;
            }


            // setter for String jobTitle
            public void setJobTitle (String jobTitle){
                this.jobTitle = jobTitle;
            }

            // getter for String companyName
            public String companyName () {
                return companyName;
            }

            // setter for String companyName
            public void String companyName(String companyName) {
                this.companyName = companyName;

                //getter for double Salary
                public double salary () {
                    return salary;
                }

                //setter for double salary
                public void setSalary ( double salary){
                    this.salary = salary;
                }

                //TODO 3 override method announce()
                public void announce () {
                    System.out.println("I am " + getFirstName() + " " + getSecondName() + " " + "and I am" + age + " " + "years old");
                }
            }
        }
    }


}