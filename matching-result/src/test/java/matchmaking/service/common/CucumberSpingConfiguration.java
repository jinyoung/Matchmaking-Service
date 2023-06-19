package matchmaking.service.common;

import io.cucumber.spring.CucumberContextConfiguration;
import matchmaking.service.MatchingResultApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { MatchingResultApplication.class })
public class CucumberSpingConfiguration {}
