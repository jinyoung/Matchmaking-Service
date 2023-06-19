package matchmaking.service.domain;

import java.util.*;
import lombok.*;
import matchmaking.service.domain.*;
import matchmaking.service.infra.AbstractEvent;

@Data
@ToString
public class MatchingAlgorithmCreatedEvent extends AbstractEvent {

    private Long userId;
    private Integer agePreferenceMin;
    private Integer agePreferenceMax;
    private String genderPreference;

    public MatchingAlgorithmCreatedEvent(MatchingAlgorithm aggregate) {
        super(aggregate);
    }

    public MatchingAlgorithmCreatedEvent() {
        super();
    }
}
