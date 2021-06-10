package waas.app.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import waas.app.model.User;
import waas.app.repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCrypt;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	public void saveUsertoDB(Map<String, String> newUser) {
		String username = newUser.get("username");
		String password = newUser.get("password");
		String email = newUser.get("email");
		String encodedPassword = BCrypt.hashpw(password, BCrypt.gensalt());
		User user = new User(username, encodedPassword, email);
		userRepository.save(user);
	}

	public User getUserByUsername(String username) {
		User dbUser = userRepository.findOneByUsername(username);
		return dbUser;
	}

}
