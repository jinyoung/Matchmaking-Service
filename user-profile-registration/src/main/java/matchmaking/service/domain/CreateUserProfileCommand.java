package matchmaking.service.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class CreateUserProfileCommand {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long userId;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String firstName;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String lastName;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Integer age;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String gender;
}
