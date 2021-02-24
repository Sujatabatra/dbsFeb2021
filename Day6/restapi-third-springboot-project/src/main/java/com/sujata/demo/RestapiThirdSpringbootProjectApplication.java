package com.sujata.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*launch applicationContext and application context will look for all the classes in com.sujata package which are annotated with
 * @Component,@Repository,@Service,@RestController and will run the life cycle all all these classes.
 * and also launching tomcat and dispatcher servlet
*/
@SpringBootApplication(scanBasePackages = "com.sujata")
public class RestapiThirdSpringbootProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestapiThirdSpringbootProjectApplication.class, args);
	}

}
