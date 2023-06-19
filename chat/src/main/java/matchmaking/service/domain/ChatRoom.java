package matchmaking.service.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import matchmaking.service.ChatApplication;
import matchmaking.service.domain.ChatRoomCreatedEvent;

@Entity
@Table(name = "ChatRoom_table")
@Data
public class ChatRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long chatRoomId;

    @PostPersist
    public void onPostPersist() {
        ChatRoomCreatedEvent chatRoomCreatedEvent = new ChatRoomCreatedEvent(
            this
        );
        chatRoomCreatedEvent.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static ChatRoomRepository repository() {
        ChatRoomRepository chatRoomRepository = ChatApplication.applicationContext.getBean(
            ChatRoomRepository.class
        );
        return chatRoomRepository;
    }
}
