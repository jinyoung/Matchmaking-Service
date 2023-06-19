package matchmaking.service.domain;

import java.util.*;
import lombok.*;
import matchmaking.service.domain.*;
import matchmaking.service.infra.AbstractEvent;

@Data
@ToString
public class UserProfileMatchedEvent extends AbstractEvent {

    private Long userId;
    private String firstName;
    private String lastName;
    private Integer age;
    private String gender;

    public UserProfileMatchedEvent(MatchingAlgorithm aggregate) {
        super(aggregate);
    }

    public UserProfileMatchedEvent() {
        super();
    }
}
