package edu.neu.dgp;

public abstract class AbstractAnimalAPI {
	private static String version = null;
	private static final int MAJOR_REVISION = 1;
	private static final int MINOR_REVISION = 0;
	private static final String MY_NAME = "Animal";
	private static final String MY_APPETITTE = "food";
	private static final String MY_MOVEMENT = "walk";
	private static final String MY_SPEACH = "grunt";

	/**
	 * static initialization block executed once for the class
	 */
	static {
		AbstractAnimalAPI.version = MAJOR_REVISION + "." + MINOR_REVISION;
	}

	/**
	 * API eat food.
	 */
	public void eat() {
		System.out.println(MY_NAME + " eating " + MY_APPETITTE);
	}

	/**
	 * API move around.
	 */
	public void move() {
		System.out.println(MY_NAME + " moving by " + MY_MOVEMENT + "ing");
	}

	/**
	 * API speak.
	 */
	public void speak() {
		System.out.println(MY_NAME + " speaking by " + MY_SPEACH + "ing");
	}

	/**
	 * String representative of object state
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(
				AbstractAnimalAPI.class.getName() + " version: " + AbstractAnimalAPI.version + "\n");

		sb.append(MY_NAME).append(" eating ").append(MY_APPETITTE.toUpperCase());
		sb.append("\n").append(MY_NAME).append(" moving by ").append(MY_MOVEMENT.toUpperCase()).append("ing.");
		sb.append("\n").append(MY_NAME).append(" speaking by ").append(MY_SPEACH.toUpperCase()).append("ing.");
		return sb.toString();
	}

	/**
	 * Demonstrate the use of this class
	 */
	public static void demo() {
		System.out.println(AbstractAnimalAPI.class.getName() + ".demo()...");

	}

}
