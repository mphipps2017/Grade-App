package GradeAppTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import GradeApp.*;

class GradeCategoryTests {

	@Test
	public void toStringTest() {
		GradeCategory gc = new GradeCategory(.15);
		for (int i = 0; i < 3; i++) {
			gc.addAssignment(new Assignment(50, 25));
		}
		assertEquals("[50.0%, 50.0%, 50.0%]", gc.toString());
	}

}
