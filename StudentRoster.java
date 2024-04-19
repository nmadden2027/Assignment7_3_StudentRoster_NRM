
	/**
	 * 
	 */

	/**
	 * 
	 */
	import java.io.File;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.io.FileNotFoundException;
	import java.util.Scanner;

	public class StudentRoster {
		// set a max
	    private static final int MAX_STUDENTS = 100;
	    private Student[] roster;
	    private int size;

	    public StudentRoster() {
	    	// constructor
	        this.roster = new Student[MAX_STUDENTS];
	        this.size = 0;
	    }

	    public void addStudent(Student student) {
	        if (size < MAX_STUDENTS) {
	            roster[size++] = student;
	        } else {
	            System.out.println("Student roster is full. Cannot add more students.");
	        }
	    }

	    public void printRoster() {
	        for (int i = 0; i < size; i++) {
	            System.out.println(roster[i]);
	            System.out.println();
	        }
	    }

	    public int size() {
	        return size;
	    }

	    public String searchStudent(String firstName, String lastName) {
	        for (int i = 0; i < size; i++) {
	            if (roster[i].getFirstName().equals(firstName) && roster[i].getLastName().equals(lastName)) {
	                return roster[i].toString();
	            }
	        }
	        // in case it fails
	        return null;
	    }

	    public void saveToFile() {
	        try {
	            FileWriter myWriter = new FileWriter("studentRoster.txt");
	            for (int i = 0; i < size; i++) {
	                myWriter.write(roster[i].toString());
	            }
	            myWriter.close();

	            System.out.println("Successfully Wrote To The Student Roster File");
	        } catch (IOException e) {
	            System.out.println("An error occurred.");
	            e.printStackTrace();
	        }
	    }

	    public void readFromFile() {
	        try {
	            File myObj = new File("studentRoster.txt");
	            Scanner myReader = new Scanner(myObj);
	            while (myReader.hasNextLine()) {
	                String data = myReader.nextLine();
	                System.out.println(data);
	            }
	            myReader.close();
	        } catch (FileNotFoundException e) {
	            System.out.println("An error occurred.");
	            e.printStackTrace();
	        }
	    }
	}
				   
