package GradeApp;

import java.util.ArrayList;

public class Class {
	ArrayList<GradeCategory> gCats;

	/**
	 * Constructs a new class object.
	 */
	public Class() {
		gCats = new ArrayList<GradeCategory>();

	}

	/**
	 * Add a grade category to this class.
	 * 
	 * @param gc
	 *            grade category to be added to this class
	 */
	public void addGradeCategory(GradeCategory gc) {
		if (checkToFull(gc))
			// THROW EXCEPTION ;

			gCats.add(gc);
	}

	/**
	 * Remove a grade category from this class.
	 * 
	 * @param index
	 *            index of grade category to be removed
	 * @return
	 */
	public GradeCategory removeGradeCategory(int index) {
		return gCats.remove(index);
	}

	private boolean checkToFull(GradeCategory gc) {
		double sum = 0;
		for (int i = 0; i < gCats.size(); i++) {
			sum = gCats.get(i).getWeight();
		}
		sum += gc.getWeight();
		return sum <= 1;
	}

	/**
	 * Get the final grade in this class.
	 * 
	 * @return the final grade in this class
	 */
	public double getFinalGrade() {
		double percentage = 0;
		for (int i = 0; i < gCats.size(); i++) {
			percentage += gCats.get(i).finalGradeTotal();
		}
		return Math.floor((percentage + .0005) * 1000) / 10;
		// return percentage;
	}
}
