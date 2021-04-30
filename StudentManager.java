package gun3odev;

public class StudentManager {
	public void joinCourse(Student student) {
		System.out.println(student.getUserName()+" "+student.getCourse()+" Kursuna başarıyla katıldınız");
	}

	public void addComment() {
		System.out.println("Yorumunuz gönderildi");
	}
}
