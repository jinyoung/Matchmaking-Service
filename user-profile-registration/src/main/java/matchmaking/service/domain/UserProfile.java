package matchmaking.service.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import matchmaking.service.UserProfileRegistrationApplication;
import matchmaking.service.domain.UserProfileCreatedEvent;
import matchmaking.service.domain.UserProfileRetrievedEvent;

@Entity
@Table(name = "UserProfile_table")
@Data
public class UserProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;

    private String firstName;

    private String lastName;

    private Integer age;

    private String gender;

    private String profileImage;

    @PostPersist
    public void onPostPersist() {
        UserProfileCreatedEvent userProfileCreatedEvent = new UserProfileCreatedEvent(
            this
        );
        userProfileCreatedEvent.publishAfterCommit();

        UserProfileRetrievedEvent userProfileRetrievedEvent = new UserProfileRetrievedEvent(
            this
        );
        userProfileRetrievedEvent.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static UserProfileRepository repository() {
        UserProfileRepository userProfileRepository = UserProfileRegistrationApplication.applicationContext.getBean(
            UserProfileRepository.class
        );
        return userProfileRepository;
    }
}
