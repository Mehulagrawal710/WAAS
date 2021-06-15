package waas.app.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;

@RestController
@CrossOrigin
public class HelloController {

	@GetMapping("hello")
	public ResponseEntity<String> hello() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String username = ((User) auth.getPrincipal()).getUsername();
		String greet = "Hello " + username;
		return new ResponseEntity<String>(greet, HttpStatus.OK);
	}

}
