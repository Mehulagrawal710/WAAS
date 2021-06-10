package waas.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScriptController {

	@GetMapping(value = "/script", produces = { "application/javascript; charset=utf-8" })
	public ResponseEntity<String> getScript() {
		System.out.println("got here");
		String script = "console.log('I have come from server')";
		return new ResponseEntity<>(script, HttpStatus.OK);
	}

}
