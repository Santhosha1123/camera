package Finalproject;

import java.util.ArrayList;
import java.util.List;

public class Login {
	private List<User> userList;

	public Login() {
		userList = new ArrayList<>();
		userList.add(new User("Santhosha", "Santhu1123")); 
	}

	public boolean authenticateUser(String username, String password) {
		for (User user : userList) {
			if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}
}

