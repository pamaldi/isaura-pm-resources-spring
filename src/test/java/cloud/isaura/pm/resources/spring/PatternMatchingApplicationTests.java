package cloud.isaura.pm.resources.spring;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cloud.isaura.pm.spring.resources.api.v1.PatternMatchingResource;
import org.springframework.test.context.ContextConfiguration;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = {PatternMatchingResource.class})
public class PatternMatchingApplicationTests {

   @Autowired
   private PatternMatchingResource patternMatchingResource;
	
	@Test
	public void contextLoads() {
		assertThat(patternMatchingResource).isNotNull();
	}

}
