/**
	 * 
	 */

	/**
	 * 
	 */
public class Student {
	private String firstName;
	private String lastName;
	private double Gpa;
	private String currentAddress;
	private String homeAddress;
	private String phoneNumber;
	
	public Student(String firstName, String lastName, String currentAddress, String homeAddress, String phoneNumber, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.currentAddress = currentAddress;
        this.homeAddress = homeAddress;
        this.phoneNumber = phoneNumber;
        this.Gpa = gpa;
    }
	public void setFirstName(String nameF) {
		firstName = nameF;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setLastName(String nameL) {
		lastName = nameL;
	}
	public String getLastName() {
		return lastName;
	}
	public void setGpa(double GPA) {
		Gpa = GPA;
	}
	public double getGpa() {
		return Gpa;
	}
	public void setCurrentAddress(String current) {
		currentAddress = current;
	}
	public String getCurrentAddress() {
		return currentAddress;
	}
	public void setHomeAddress(String home) {
		homeAddress = home;
	}
	public String getHomeAddress() {
		return homeAddress;
	}
	public void setPhoneNumber(String phone) {
		phoneNumber = phone;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	// Print all info
	public String toString() {
		return getFirstName() + ", " + getLastName() + ", " + getGpa() + ", " + getPhoneNumber() + ", " + getCurrentAddress() + ", " + getHomeAddress() + " | ";
	}
	

}

