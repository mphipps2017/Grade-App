package GradeApp;

import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {
		Class math = new Class("math");
		GradeCategory gc = new GradeCategory(.5, "Everything");
		GradeCategory test = new GradeCategory(.5, "test");
		test.addAssignment(new Assignment(9,10));
		math.addGradeCategory(gc);
		math.addGradeCategory(test);
		for (int i = 0; i < 1; i++) {
			gc.addAssignment(new Assignment(50, 100));
		}
		PostOperation.saveInfo(math);
	}

}
