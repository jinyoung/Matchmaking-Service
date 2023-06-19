package matchmaking.service.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class SendMessageCommand {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long chatRoomId;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long senderId;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long receiverId;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String messageText;
}
