package matchmaking.service.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class CreateChatRoomCommand {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long userOneId;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long userTwoId;
}
