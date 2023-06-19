package matchmaking.service.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import matchmaking.service.MatchingResultApplication;

@Entity
@Table(name = "MatchingResult_table")
@Data
public class MatchingResult {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;

    private Long matchedUserId;

    private Date matchedOn;

    @PrePersist
    public void onPrePersist() {}

    public static MatchingResultRepository repository() {
        MatchingResultRepository matchingResultRepository = MatchingResultApplication.applicationContext.getBean(
            MatchingResultRepository.class
        );
        return matchingResultRepository;
    }
}
