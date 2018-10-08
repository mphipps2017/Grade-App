package GradeAppTests;

import GradeApp.*;
import GradeApp.Class;

public class mainMethodTest {

	public static void main(String[] args) {
		GradeCategory hw = new GradeCategory(.1);
		hw.addAssignment(new Assignment(75, 100));
		GradeCategory exams = new GradeCategory(.9);
		exams.addAssignment(new Assignment(85, 100));
		Class math = new Class();
		math.addGradeCategory(hw);
		math.addGradeCategory(exams);
		System.out.println(math.getFinalGrade());
	}

}
