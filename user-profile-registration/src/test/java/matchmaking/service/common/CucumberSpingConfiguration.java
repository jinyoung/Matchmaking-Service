package matchmaking.service.common;

import io.cucumber.spring.CucumberContextConfiguration;
import matchmaking.service.UserProfileRegistrationApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { UserProfileRegistrationApplication.class })
public class CucumberSpingConfiguration {}
