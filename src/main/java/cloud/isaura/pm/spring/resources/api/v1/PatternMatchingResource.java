package cloud.isaura.pm.spring.resources.api.v1;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import cloud.isaura.pm.spring.resources.api.v1.model.PatternMatchingRequest;
import cloud.isaura.pm.spring.resources.api.v1.model.PatternMatchingResponse;

import org.springframework.http.HttpStatus;

@RestController
@EnableAutoConfiguration
public class PatternMatchingResource {

	@RequestMapping(value = "/pattern-matching/ping", method = RequestMethod.GET)
	String ping(@RequestParam(value = "name") String name) {
		return "Hi " + name;
	}
	
	@PostMapping(value = "/pattern-matching/submit")
    @ResponseStatus(HttpStatus.CREATED)
    public PatternMatchingResponse create(@RequestBody PatternMatchingRequest request) {
      
        return null;
    }
}
