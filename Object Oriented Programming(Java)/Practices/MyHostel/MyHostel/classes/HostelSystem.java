package classes;
import interfaces.*;

public class HostelSystem implements StudentOperations, EmployeeOperations {
	private Student students[] = new Student[50];
	private Employee employees[] = new Employee[10];

	public void insertStudent(Student s) {
		int flag = 0;
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = s;
				flag = 1;
				break;
			}
		}
		if (flag == 1) {
			System.out.println("Student Inserted");
		} else {
			System.out.println("Can Not Insert");
		}
	}

	public void removeStudent(Student s) {
		int flag = 0;
		for (int i = 0; i < students.length; i++) {
			if (students[i] == s) {
				students[i] = null;
				flag = 1;
				break;
			}
		}
		if (flag == 1) {
			System.out.println("Students Removed");
		} else {
			System.out.println("Can Not Remove");
		}
	}

	public void showAllStudents() {
		for (Student s : students) {
			if (s != null) {
				System.out.println("**********************************");
				System.out.println("Student Name: " + s.getName());
				System.out.println("Student ID: " + s.getID());
				System.out.println("----------------------------------");
				s.showAllStudents();
				System.out.println("----------------------------------");
			}
		}
	}

	public Student getStudent(int ID) {
		Student s = null;

		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				if (students[i].getID() == ID) {
					s = students[i];
					break;
				}
			}
		}
		if (s != null) {
			System.out.println("Student Found");
		} else {
			System.out.println("Student Not Found");
		}
		return s;
	}

	public void insertEmployee(Employee e) {
		int flag = 0;
		for (int i = 0; i < employees.length; i++) {
			if (employees[i] == null) {
				employees[i] = e;
				flag = 1;
				break;
			}
		}
		if (flag == 1) {
			System.out.println("Employee Inserted");
		} else {
			System.out.println("Can Not Insert");
		}
	}

	public void removeEmployee(Employee e) {
		int flag = 0;
		for (int i = 0; i < employees.length; i++) {
			if (employees[i] == e) {
				employees[i] = null;
				flag = 1;
				break;
			}
		}
		if (flag == 1) {
			System.out.println("Employee Removed");
		} else {
			System.out.println("Can Not Remove");
		}
	}

	public void showAllEmployees() {
		System.out.println("----------------------");
		for (Employee e : employees) {
			if (e != null) {
				System.out.println("Employee Name: " + e.getName());
				System.out.println("Employee ID: " + e.getEmpId());
				System.out.println("Salary: " + e.getSalary());
				System.out.println();
			}
		}
		System.out.println("-------------------------");
	}

	public Employee getEmployee(String empId) {
		Employee e = null;

		for (int i = 0; i < employees.length; i++) {
			if (employees[i] != null) {
				if (employees[i].getEmpId().equals(empId)) {
					e = employees[i];
					break;
				}
			}
		}
		if (e != null) {
			System.out.println("Employee Found");
		} else {
			System.out.println("Employee Not Found");
		}
		return e;
	}

    public void insertCustomer(Student s) {
    }

	@Override
	public Student getID(int ID) {
		// TODO Auto-generated method stub
		return null;
	}

}