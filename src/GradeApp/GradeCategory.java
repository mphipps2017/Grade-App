package GradeApp;

import java.util.ArrayList;

public class GradeCategory {
	ArrayList<Assignment> assignments;
	double weight;

	/**
	 * Constructor for a grade category
	 * 
	 * @param weight
	 *            the percentage of final grade this grade category is, must be 0 <
	 *            weight < 1
	 */
	public GradeCategory(double weight) {
		assignments = new ArrayList<Assignment>();
		this.weight = weight;
	}

	/**
	 * Add a grade on an assignment to this grade category.
	 * 
	 * @param grade
	 *            an assignment
	 */
	public void addAssignment(Assignment grade) {
		assignments.add(grade);
	}

	/**
	 * Returns the percentage received in this category.
	 * 
	 * @return Percentage received in this category
	 */
	public double getGrade() {
		double sum = 0;
		double total = 0;
		for (int i = 0; i < assignments.size(); i++) {
			sum += assignments.get(i).getScore();
			total += assignments.get(i).getTotal();
		}
		return sum / total;
	}

	/**
	 * Method to retrieve the percentage of final grade this grade category is.
	 * 
	 * @return weight on final grade
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * Retrieves the final grade total, e.g. the percentage of your final grade
	 * category is.
	 * 
	 * @return percentage this category makes up of your final grade
	 */
	public double finalGradeTotal() {
		return getGrade() * weight;
	}

	/**
	 * Removes the assignment from the given index of the array list
	 * 
	 * @param index
	 *            index of assignment to be removed
	 * @return assignment removed
	 */
	public Assignment removeAssignment(int index) {
		return assignments.remove(index);
	}

	/**
	 * Returns a string representation of this grade category.
	 * 
	 * @return a string representation of this grade category
	 */
	@Override
	public String toString() {
		String returner = "[";
		for (int i = 0; i < assignments.size(); i++) {
			if (i > 0) {
				returner += ", ";
			}
			returner += assignments.get(i).toString();
		}
		return returner + "]";
	}
}
