package matchmaking.service.common;

import io.cucumber.spring.CucumberContextConfiguration;
import matchmaking.service.ChatApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { ChatApplication.class })
public class CucumberSpingConfiguration {}
