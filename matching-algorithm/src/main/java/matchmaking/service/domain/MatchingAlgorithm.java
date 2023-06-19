package matchmaking.service.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import matchmaking.service.MatchingAlgorithmApplication;
import matchmaking.service.domain.MatchingAlgorithmCreatedEvent;
import matchmaking.service.domain.UserProfileMatchedEvent;

@Entity
@Table(name = "MatchingAlgorithm_table")
@Data
public class MatchingAlgorithm {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;

    private Integer agePreferenceMin;

    private Integer agePreferenceMax;

    private String genderPreference;

    @PostPersist
    public void onPostPersist() {
        MatchingAlgorithmCreatedEvent matchingAlgorithmCreatedEvent = new MatchingAlgorithmCreatedEvent(
            this
        );
        matchingAlgorithmCreatedEvent.publishAfterCommit();

        UserProfileMatchedEvent userProfileMatchedEvent = new UserProfileMatchedEvent(
            this
        );
        userProfileMatchedEvent.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static MatchingAlgorithmRepository repository() {
        MatchingAlgorithmRepository matchingAlgorithmRepository = MatchingAlgorithmApplication.applicationContext.getBean(
            MatchingAlgorithmRepository.class
        );
        return matchingAlgorithmRepository;
    }

    public static void userProfileMatchedPolicy(
        UserProfileMatchedEvent userProfileMatchedEvent
    ) {
        //implement business logic here:

        /** Example 1:  new item 
        MatchingAlgorithm matchingAlgorithm = new MatchingAlgorithm();
        repository().save(matchingAlgorithm);

        */

        /** Example 2:  finding and process
        
        repository().findById(userProfileMatchedEvent.get???()).ifPresent(matchingAlgorithm->{
            
            matchingAlgorithm // do something
            repository().save(matchingAlgorithm);


         });
        */

    }
}
