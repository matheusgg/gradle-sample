package br.com.sample.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sample.model.SimpleResponse;

/**
 * The type Simple controller.
 */
@RestController
public class SimpleController {

	/**
	 * The Property.
	 */
	@Value("${someProperty}")
	private String property;

	/**
	 * Property simple response.
	 *
	 * @return the simple response
	 */
	@GetMapping("/property")
	public SimpleResponse property() {
		return new SimpleResponse(this.property);
	}

	/**
	 * Greetings string.
	 *
	 * @return the string
	 */
	@GetMapping("/greetings")
	public String greetings() {
		return "Hello!";
	}
}
