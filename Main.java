package gun3odev;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student(1, "Semih Akyildiz", "student1@mail.com", "********", "java-react");

		Student student2 = new Student();
		student2.setId(2);
		student2.setUserName("Ahmet Mehmet");
		student2.setEmail("student2@mail.com");
		student2.setPassword("****");

		Instructor instructor1 = new Instructor();
		instructor1.setId(3);
		instructor1.setUserName("Engin Demiroğ");
		instructor1.setEmail("instructor@mail.com");
		instructor1.setPassword("*****");
		instructor1.setAnnouncements("Şöyle oldu. Böyle oldu.");

		UserManager userManager = new UserManager();
		userManager.add(student1);
		userManager.add(student2);
		userManager.add(instructor1);

		System.out.println("----------------");
		User[] users = { student2, instructor1 };
		userManager.deleteMultiple(users);

		System.out.println("----------------");
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addAnnouncements(instructor1);

		System.out.println("----------------");
		StudentManager studentManager = new StudentManager();
		studentManager.joinCourse(student1);
	}

}
