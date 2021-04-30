package gun3odev;

public class Instructor extends User {
	private String courses;
	private String announcements;

public Instructor() {
		
	}

	public Instructor(int id, String userName, String email, String password, String courses, String announcements) {
		super(id, userName, email, password);
		this.courses = courses;
		this.announcements = announcements;
	}

	public String getCourses() {
		return courses;
	}

	public void setCourses(String courses) {
		this.courses = courses;
	}

	public String getAnnouncements() {
		return announcements;
	}

	public void setAnnouncements(String announcements) {
		this.announcements = announcements;
	}
}
