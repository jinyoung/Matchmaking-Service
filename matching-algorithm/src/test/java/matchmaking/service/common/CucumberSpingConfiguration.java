package matchmaking.service.common;

import io.cucumber.spring.CucumberContextConfiguration;
import matchmaking.service.MatchingAlgorithmApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { MatchingAlgorithmApplication.class })
public class CucumberSpingConfiguration {}
