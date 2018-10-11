package GradeApp;
/**
 * 
 * @author Matthew Phipps
 *
 */
public class Assignment {
	private double total;
	private double score;

	/**
	 * Constructor for an assignment with a total score, and score gotten
	 * 
	 * @param total
	 *            total amount of points on an assignment
	 * @param score
	 *            score gotten on an assignment
	 */
	public Assignment(double scoreGotten, double total) {
		this.total = total;
		this.score = scoreGotten;
	}

	/**
	 * Constructor for an incomplete assignment
	 * 
	 * @param total
	 *            total amount of points on an assignment
	 */
	public Assignment(double total) {
		this.total = total;
		score = -1;
	}

	/**
	 * Method to get the total points for assignment.
	 * 
	 * @return total points on an assignment
	 */
	public double getTotal() {
		return total;
	}

	/**
	 * Method that gets the score gotten on an assignment.
	 * 
	 * @return Score gotten on this assignment
	 */
	public double getScore() {
		return score;
	}

	/**
	 * Calculates the percentage gotten on this assignment.
	 * 
	 * @return Percentage gotten on assignment
	 */
	public double getPercentage() {
		return score / total;
	}

	/**
	 * Checks if an assignment has been graded/completed
	 * 
	 * @return True if graded, false if not
	 */
	public boolean gradedAssignment() {
		return score > 0;
	}

	/**
	 * Set score for this assignment
	 * 
	 * @param score
	 *            Score gotten on assignment
	 */
	public void setScore(double score) {
		this.score = score;

	}

	/**
	 * Returns a string implementation of this assignment.
	 * 
	 * @return a string that represents this assignment
	 */
	@Override
	public String toString() {
		return Math.floor(getPercentage() * 1000)/10 + "%";
	}
}
