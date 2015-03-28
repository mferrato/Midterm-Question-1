package mainPackage;

public class Employee extends Person {
	String office;
	double salary;
	MyDate dateHired;

}

class Faculty extends Employee {
	String officeHours; // Since you can have many office hours I decided to
						// make it a string
	String rank;

	@Override
	public String toString() {
		return "Faculty [rank=" + rank + ", name=" + name + "]";
	}

}

class Staff extends Employee {
	String title;

	@Override
	public String toString() {
		return "Staff [title=" + title + ", name=" + name + "]";
	}
}
