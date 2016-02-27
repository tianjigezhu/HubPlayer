import com.horstmann.corejava.*;
// the Employee class is defined that package

import static java.lang.System.*;

/**
 * This program demonstrates the use of packages.
 * @author Tianjigezhu
 * @version 1.11 2015-12-10
 * @author Tianjigezhu
 */
public class PackageTest {
	public static void main(String[] args) {
		Employee harry = new Employee("Harry Hacker", 50000, 1989, 10, 1);
		
		harry.raiseSalary(5);
		
		// because of the static import statement, we don't have to use System.out here
		out.println("name=" + harry.getName() + ",salary=" + harry.getSalary());
	}
}
