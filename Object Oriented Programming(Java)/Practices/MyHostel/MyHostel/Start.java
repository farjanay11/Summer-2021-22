import classes.*;

import java.util.*;
public class Start{
public static void main(String[] args) {
    System.out.println("Welcome to Hostel");
		boolean choice = true;
		Scanner sc = new Scanner(System.in);
		HostelSystem b = new HostelSystem();
		

        while(choice)
		{
			System.out.println("Here are Some Options for You: \n");
			System.out.println("	1. Employee Management");
			System.out.println("	2. Student Management");
			System.out.println("	3. student Account Management");
			System.out.println("	4. Exit the Application\n");
			System.out.print("What do you want to do? : ");
			
			int first;
			while (true) {
				if (sc.hasNextInt()) {
					first = sc.nextInt();
					break;
				}
				String s = sc.next();
				System.out.println("");
				System.out.println("Invalid " + s +" again");
				System.out.println("");
				System.out.print("Enter vailade Number: ");
			}
			int second1;
			int second2;
			int second3;
			switch(first)
			{
				case 1:
					
					System.out.println("You have selected Employee Management");
					System.out.println("Here are Some Options for You: \n");
					System.out.println("	1. Create New Employee");
                    System.out.println("	2. Employee Food");
					System.out.println("	3. Remove Existing Employee");
					System.out.println("	4. See all Employees");
					System.out.println("	5. Go Back\n");
					System.out.print("What do you want to do? : ");
					while (true) {
						if (sc.hasNextInt()) {
							second1 = sc.nextInt();
							break;
						}
						String s = sc.next();
						System.out.println("");
						System.out.println("Invalid " + s +" again");
						System.out.println("");
						System.out.print("Enter vailade Number: ");
					}
					switch(second1)
					{
						case 1:
							
							System.out.println("You have Selected to create a new Employee\n");
							System.out.print("Enter Employee Id: ");
							String empId = sc.next();
							
							System.out.print("Enter Employee Name: ");
							String name = sc.next();
							
							System.out.print("Enter Employee Salary: ");
							double salary = sc.nextDouble();
							
							
							Employee e = new Employee();
							e.setEmpId(empId);
							e.setName(name);
							e.setSalary(salary);
							if(salary>=0){
								System.out.println("accepted");
							}
							else{
								System.out.println("not accepted");
							}
							b.insertEmployee(e);
							
							
							break;

						case 2:
                                Item i = new Item();
                                i.customerInformation();
                                i.menu();
							break;	
						case 3:
							
							System.out.println("You have Selected to remove an existing Employee");
							System.out.print("Enter Employee Id: ");
							
							
							b.removeEmployee(b.getEmployee(sc.next()));
							
							break;
							
						case 4:
							
							System.out.println("You have Selected to see all Employees");
							
							b.showAllEmployees();
							
							break;
						
						case 5:
							
							System.out.println("You have Selected to Go Back");
							break;
						
						default:
							
							System.out.println("Invalid Input");
							break;
					}
					
					break;
					
				case 2:
				
					System.out.println("You have selected Student Management");
					
					System.out.println("Here are Some Student for You: \n");
					System.out.println("	1. Create New Student");
                    System.out.println("	2. Student Food");
					System.out.println("	3. Remove Existing Students");
					System.out.println("	4. See all Students");
					System.out.println("	5. Go Hostel\n");
					System.out.print("What do you want to do? : ");
					
					while (true) {
						if (sc.hasNextInt()) {
							second2 = sc.nextInt();
							break;
						}
						String s = sc.next();
						System.out.println("");
						System.out.println("Invalid " + s +" again");
						System.out.println("");
						System.out.print("Enter vailade Number: ");
					}
					switch(second2)
					{
						case 1:
						
							System.out.print("Enter Student Name: ");
							String name1 = sc.next();
                            System.out.print("Enter Student ID: ");
							int ID1 = sc.nextInt();
							
							Student s = new Student();
							s.setID(ID1);
							s.setName(name1);
							
							b.insertStudent(s);
							break;

                            case 2:
                                Item i = new Item();
                                i.customerInformation();
                                i.menu();
							break;
						case 3:
						
							System.out.print("Enter Student ID: ");
							int ID = sc.nextInt();
							HostelSystem h = new HostelSystem();
							Student a= h.getID(ID);
							b.removeStudent(a);
							break;
						
						case 4:
							b.showAllStudents();
							break;
						
						case 5:
						
							System.out.println("Going Hostel . . .");
							break;
							
						default:
						
							System.out.println("Invalid Input");
							break;
					}
					
					break;
				
				case 3:
					
					System.out.println("You have selected Student Account Management");
					
					System.out.println("Here are Some Options for You: \n");
					System.out.println("	1. Create New Account for a Student");
					System.out.println("	2. Remove Existing Account of a Student");
					System.out.println("	3. See all Accounts of a Student");
					System.out.println("	4. Go Hostel\n");
					System.out.print("What do you want to do? : ");
					
					while (true) {
						System.out.print("Enter ID: ");
						if (sc.hasNextInt()) {
							second3 = sc.nextInt();
							break;
						}
						String s = sc.next();
						System.out.println("");
						System.out.println("Invalid " + s +" again");
						System.out.println("");
						System.out.print("Enter vailade Number: ");
					}
					switch(second3)
					{
						case 1: 
						
							break;
							
						case 2:
						
							System.out.print("Enter Student ID: ");
							int ID = sc.nextInt();
							System.out.print("Enter Hostel Room Number: ");
							int an2 = sc.nextInt();
						
                            b.getStudent(ID).removeHostel(b.getStudent(ID).getroomNumber(an2));
							
							break;
							
						case 3:
						    
							System.out.print("Enter Student ID: ");
							int ID2 = sc.nextInt();
							
                            b.getStudent(ID2).showAllStudents();
							break;
							
						case 4:
						
							System.out.println("Going Back . . .");
							break;
							
						default:
						
							System.out.println("Invalid Input");
							break;
					}
					
					break;
					
				case 4:
					
					System.out.println("You have selected to exit the application");
					System.out.println("Thank you for using Our Hostel");
					choice = false;
					break;
					
				default:
				
					System.out.println("Invalid Input");
					break;
			}
        }
	}
}
 
