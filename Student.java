package gun3odev;

public class Student extends User {

	private String Course;

	public Student() {

	}

	public Student(int id, String userName, String email, String password, String course) {

		super(id, userName, email, password);
		Course = course;
	}

	public String getCourse() {
		return Course;
	}

	public void setCourse(String course) {
		Course = course;
	}
}
