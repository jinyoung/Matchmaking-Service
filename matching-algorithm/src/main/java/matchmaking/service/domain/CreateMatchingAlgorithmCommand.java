package matchmaking.service.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class CreateMatchingAlgorithmCommand {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long userId;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Integer agePreferenceMin;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Integer agePreferenceMax;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String genderPreference;
}
