package gun3odev;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getUserName() + " adlý kullanýcý eklendi");
	}

	public void edit(User user) {
		System.out.println(user.getUserName() + " adlý kullanýcý düzenlendi");
	}

	public void delete(User user) {
		System.out.println(user.getUserName() + " adlý kullanýcý silindi");
	}

	public void addMultiple(User[] users) {
		for (User addUser : users) {
			add(addUser);
		}
	}

	public void deleteMultiple(User[] users) {
		for (User delUser : users) {
			delete(delUser);
		}
	}
}
