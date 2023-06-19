package matchmaking.service.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import matchmaking.service.config.kafka.KafkaProcessor;
import matchmaking.service.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PolicyHandler {

    @Autowired
    MatchingAlgorithmRepository matchingAlgorithmRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='UserProfileCreatedEvent'"
    )
    public void wheneverUserProfileCreatedEvent_UserProfileCreatedPolicy(
        @Payload UserProfileCreatedEvent userProfileCreatedEvent
    ) {
        UserProfileCreatedEvent event = userProfileCreatedEvent;
        System.out.println(
            "\n\n##### listener UserProfileCreatedPolicy : " +
            userProfileCreatedEvent +
            "\n\n"
        );
        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='UserProfileMatchedEvent'"
    )
    public void wheneverUserProfileMatchedEvent_UserProfileMatchedPolicy(
        @Payload UserProfileMatchedEvent userProfileMatchedEvent
    ) {
        UserProfileMatchedEvent event = userProfileMatchedEvent;
        System.out.println(
            "\n\n##### listener UserProfileMatchedPolicy : " +
            userProfileMatchedEvent +
            "\n\n"
        );

        // Sample Logic //
        MatchingAlgorithm.userProfileMatchedPolicy(event);
    }
}
