package matchmaking.service.domain;

import java.util.*;
import lombok.*;
import matchmaking.service.domain.*;
import matchmaking.service.infra.AbstractEvent;

@Data
@ToString
public class ChatRoomCreatedEvent extends AbstractEvent {

    private Long chatRoomId;
    private Long userOneId;
    private Long userTwoId;

    public ChatRoomCreatedEvent(ChatRoom aggregate) {
        super(aggregate);
    }

    public ChatRoomCreatedEvent() {
        super();
    }
}
