package gun3odev;

public class InstructorManager {
	public void addCourse() {
		System.out.println("Kurs Eklendi");
	}

	public void addAnnouncements(Instructor instructor) {
		System.out.println("Duyuru Eklendi-> "+ instructor.getAnnouncements());
	}

}
