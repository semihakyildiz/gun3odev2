package gun3odev;

public class StudentManager {
	public void joinCourse(Student student) {
		System.out.println(student.getUserName()+" "+student.getCourse()+" Kursuna ba�ar�yla kat�ld�n�z");
	}

	public void addComment() {
		System.out.println("Yorumunuz g�nderildi");
	}
}
