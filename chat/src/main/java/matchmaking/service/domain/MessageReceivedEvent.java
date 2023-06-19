package matchmaking.service.domain;

import java.util.*;
import lombok.*;
import matchmaking.service.domain.*;
import matchmaking.service.infra.AbstractEvent;

@Data
@ToString
public class MessageReceivedEvent extends AbstractEvent {

    private Long messageId;
    private Long chatRoomId;
    private Long senderId;
    private Long receiverId;
    private String messageText;
    private Date messageTime;

    public MessageReceivedEvent(ChatMessage aggregate) {
        super(aggregate);
    }

    public MessageReceivedEvent() {
        super();
    }
}
