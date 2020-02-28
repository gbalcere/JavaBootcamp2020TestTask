package sef.ATestTask.FirstActivity;
import java.util.ArrayList;


public class FirstActivity extends Employee {

	public FirstActivity() {
		super(1, "S", "D", 30.0);
	}

	public static void main(String[] args) {

		//TODO 1 Create collection of employee (more than 5) list or map

		ArrayList <Employee> Employee = new ArrayList<Employee>();
		Employee.add(new Employee (1,"S","D",30.0));
		Employee.add(new Employee(2,"Z","C",34.0));
		Employee.add(new Employee(3,"F","K",50.0));
		Employee.add(new Employee(4,"I","P",67.0));
		Employee.add(new Employee(5,"T","Y",56.0));

		System.out.println("\nPrint using index of an element: ");

		for (int i = 0; i < Employee.size();i++) {
			Employee e = Employee.get(i);
			System.out.println("empId"+ e.getEmpId() + " / " + "jobTitle" + e.getJobTitle() + " / " + "companyName" + e.getCompanyName() + " / " + "salary" + e.getSalary());
		}


		}


			//		System.out.println() result

			//TODO 2 sort and this employees by salary (from min to max)
			// TIP - google bubble sort
			//		System.out.println() result

			//TODO 3 create instance of a Student as a Person ->
			// than ask him introduce()
			// than make them Student
			// than ask him introduce()


			//TODO 4 Create method for full change of employee information
			// for example some employee change his work


		}
	}
}


