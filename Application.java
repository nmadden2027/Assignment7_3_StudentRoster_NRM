	/**
	 * 
	 */

	/**
	 * 
	 */
	import java.util.Scanner;
	public class Application {
		/**
		 * @param args
		 */
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scnr = new Scanner (System.in);
			StudentRoster studentRoster = new StudentRoster();
			boolean exit = false;
			// To Quit Program 
			while (!exit) {
			// To Enter Student Info
			System.out.println("To Enter Student Info Please Press 1");
			// Print Student List
			System.out.println("To Print Student Roster Please Press 2");
			//Enter student name and print info on student
			System.out.println("To Search For Student Info Please Press 3");
			//Save the student roster to disk
			System.out.println("To Save Roster To The Disk Please Press 4");
			//Read the student roster from disk
			System.out.println("To Read The Student Roster From The Disk Press 5");
			//Exit the program
			System.out.println("To Exit The Program Please Press 6");
			int input = scnr.nextInt();
			switch (input) {
			case 1:
				// check for correct info
				boolean done = false;
				while (!done) {
				System.out.println("Enter Student First Name");
				String firstName = scnr.next();
				System.out.println("Enter Student Last Name");
				String lastName = scnr.next();
				System.out.println("Enter Student Current GPA");
				double Gpa = scnr.nextDouble();
				scnr.nextLine();
				System.out.println("Enter Phone Number For Student");
				String phoneNumber = scnr.nextLine();
				System.out.println("Enter Student Current Address");
				String currentAddress = scnr.nextLine();
				System.out.println("Enter Student Home Address");
				String homeAddress = scnr.nextLine();
				System.out.println("First Name: " + firstName);
				System.out.println("Last Name: " + lastName);
				System.out.println("Gpa: " + Gpa);
				System.out.println("Phone Number: " + phoneNumber);
				System.out.println("Current Address: " + currentAddress);
				System.out.println("Home Address: " + homeAddress);
				System.out.println("Is This All Correct? Hit 1 For Yes and 2 For No.");
				// option incase something is mistyped 
				int answer = scnr.nextInt();
				switch (answer) {
				case 1:
					// add to roster
					Student newStudent = new Student(firstName, lastName, currentAddress, homeAddress, phoneNumber, Gpa);
		            studentRoster.addStudent(newStudent);
		            System.out.println("Student Info Succesfully Added To Roster. To Check Please Hit 2 In The Menu.");
		            done = true;
		            break;
				case 2:
					// fail to add to roster
					System.out.println("Please Go Back To Menu And Try Again. Student Info Not Added.");
					done = true;
				}
				}
				break;
			case 2:
				// print total students and the students
				if (studentRoster.size() == 1) {
				System.out.println(studentRoster.size()+ " Total Student");
				}
				else {
					System.out.println(studentRoster.size()+ " Total Students");
				}
				if (studentRoster.size() >= 5) {
					System.out.println("You Have A Full Class");
				}
				else {
					System.out.println("You Do Not Have A Full Class");
					System.out.println("To Have A Full Class You Need At Least 5 Students");
				}
	            studentRoster.printRoster();
	            break;

	        case 3:
	        	// account for a mistype that gives a student
	        	boolean mistype = false;
	        	while (!mistype) {
	        	// Search For Student 
	            System.out.println("Enter Student First Name");
	            String fName = scnr.next();
	            System.out.println("Enter Student Last Name");
	            String lName = scnr.next();
	            String studentInfo = studentRoster.searchStudent(fName, lName);
	            if (studentInfo != null) {
	            	System.out.println("The Student " + fName + " " + lName + " Is In The Roster");
	            	System.out.println(studentInfo);
	            	System.out.println("Is This All Correct? Hit 1 For Yes and 2 For No.");
	            	// option incase something is mistyped 
	            				int is = scnr.nextInt();
	            				switch (is) {
	            				case 1:
	            					mistype = true;
	            					break;
	            				case 2:
	            					System.out.println("Go Back To Menu And Try Again. Possible First Letters Were Not Capitalized.");
	            					mistype = true;
	            					break;
	            				}
	            }
	            else 
	            {
	            	System.out.println("Student " + fName + ", " + lName + " Is Not In The Roster");
	            }
	        	}	
	            break;

	        case 4:
	           // save roster to the disk
	        	studentRoster.saveToFile();
	            break;

	        case 5:
	        	// read the roster off of the disk
	            studentRoster.readFromFile();
	            break;

	        case 6:
	        	//Exit The Program
	           exit = true;
	            break;

			}
			}
		}

}
