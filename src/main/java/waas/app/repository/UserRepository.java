package waas.app.repository;

import java.util.ArrayList;
import org.springframework.data.mongodb.repository.MongoRepository;
import waas.app.model.User;

public interface UserRepository extends MongoRepository<User, String> {

	User findOneByUsername(String username);

	ArrayList<User> findByUsername(String username);

	ArrayList<User> findByEmail(String email);

}