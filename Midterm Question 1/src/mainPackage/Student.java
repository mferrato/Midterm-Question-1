package mainPackage;

public class Student extends Person {
	 final String status = null;
	
	// I didn't quite understand how I would set status as a constant without
	// knowing which actual class status you wanted so I chose null.

	@Override
	public String toString() {
		return "Student [status=" + status + ", name=" + name + "]";
	}
}
