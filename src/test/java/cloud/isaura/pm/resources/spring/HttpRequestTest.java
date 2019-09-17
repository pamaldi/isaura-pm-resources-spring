package cloud.isaura.pm.resources.spring;

import static org.assertj.core.api.Assertions.assertThat;

import java.net.URI;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.util.UriComponentsBuilder;

import cloud.isaura.pm.spring.resources.api.v1.PatternMatchingResource;
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@ContextConfiguration(classes = {PatternMatchingResource.class})
public class HttpRequestTest {

	
	@LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void greetingShouldReturnDefaultMessage() throws Exception {
    	String url = "http://localhost:" + this.port;
        URI uri = UriComponentsBuilder.fromHttpUrl(url).path("/pattern-matching/ping")
                 .queryParam("name", "pasquale").build().toUri();
        ResponseEntity<String> response = this.restTemplate.getForEntity(uri, String.class);
        assertThat(response).isNotNull();
 		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
 		assertThat((String) response.getBody()).contains("Hi pasquale");
        
    }
}
